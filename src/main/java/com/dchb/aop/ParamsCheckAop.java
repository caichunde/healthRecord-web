package com.dchb.aop;

import com.alibaba.fastjson.JSONObject;
import com.dchb.annotation.ParamsCheckAnnotation;
import com.dchb.util.RSAUtils;
import org.apache.commons.lang3.StringUtils;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Pointcut;
import org.aspectj.lang.reflect.MethodSignature;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;
import org.springframework.web.context.request.RequestContextHolder;
import org.springframework.web.context.request.ServletRequestAttributes;

import javax.servlet.http.HttpServletRequest;
import java.io.*;
import java.lang.annotation.Annotation;
import java.lang.reflect.Method;
import java.net.URLDecoder;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

@Component
@Aspect
public class ParamsCheckAop {
    private Logger logger = LoggerFactory.getLogger(this.getClass());
    private static final HashMap<String, Class> MAP = new HashMap<String, Class>() {
        {
            put("Integer", int.class);
            put("Double", double.class);
            put("Float", float.class);
            put("Long", long.class);
            put("Short", short.class);
            put("Boolean", boolean.class);
            put("Char", char.class);
            put("String", String.class);
        }
    };

    /**
     * 定义有一个切入点，范围为web包下的类
     */
    @Pointcut("@within(com.dchb.annotation.ParamsCheckAnnotation) || @annotation(com.dchb.annotation.ParamsCheckAnnotation)")
    public void checkParams() {
    }

    @Around("checkParams() && @annotation(paramsCheckAnnotation)")
    public Object doBefore(ProceedingJoinPoint pjp, ParamsCheckAnnotation paramsCheckAnnotation) throws Throwable {
        ServletRequestAttributes attributes = (ServletRequestAttributes) RequestContextHolder.getRequestAttributes();
        HttpServletRequest request = attributes.getRequest();
        InputStream inputStream = request.getInputStream();
        String methodType = request.getMethod();
        MethodSignature signature = (MethodSignature) pjp.getSignature();
        //得到拦截的方法
        Method method = signature.getMethod();
        //获取方法参数注解，返回二维数组是因为某些参数可能存在多个注解
        Annotation[][] parameterAnnotations = method.getParameterAnnotations();
        for (int i = 0; i < parameterAnnotations.length; i++) {
            System.out.println("-"+parameterAnnotations[i]);
            for (int j = 0; j < parameterAnnotations[i].length; j++) {
                System.out.println("--"+parameterAnnotations[i][j]);
            }
        }
        String body = getBody(inputStream);
        if (StringUtils.isEmpty(body)) {
            return pjp.proceed();
        }
        //获取方法参数名
        String[] paramNames = signature.getParameterNames();
        //获取参数值
        Object[] paranValues = pjp.getArgs();
        //获取方法参数类型
        Class<?>[] parameterTypes = method.getParameterTypes();
//        for (int i = 0; i < parameterTypes.length; i++) {
//            System.out.println(parameterTypes[i]);
//        }
        if ("GET".equals(methodType)) {
            Map map = request.getParameterMap();
            Set keySet = map.entrySet();
            for (Iterator itr = keySet.iterator(); itr.hasNext(); ) {
                Map.Entry me = (Map.Entry) itr.next();
                Object ok = me.getKey();
                Object ov = me.getValue();
                String[] value = new String[1];
                if (ov instanceof String[]) {
                    value = (String[]) ov;
                } else {
                    value[0] = ov.toString();
                }
                for (int k = 0; k < value.length; k++) {
                    String content = ok + value[k];
                    body = content.replaceAll(" ", "+");
                    body = body.replaceAll("}", "=}");
                }
            }
        }
        String decodedData = RSAUtils.decryptDataOnJava(easpString(body));
        JSONObject jsonObject = JSONObject.parseObject(decodedData);
        for (int i = 0, len = paramNames.length; i < len; i++) {
            Class c = parameterTypes[i];
            String name = paramNames[i];
            String str = c.toString();
            String key = str.substring(str.lastIndexOf(".") + 1, str.length());
            Object data = paranValues[i];
            if (MAP.containsKey(key)) {
                paranValues[i] = jsonObject.get(name);
            } else if ("HttpServletRequest".equals(key) || "HttpServletResponse".equals(key) || "Model".equals(key)) {
                paranValues[i] = data;
            } else {
                paranValues[i] = JSONObject.parseObject(decodedData, c);
            }
        }
        return pjp.proceed(paranValues);
    }

    /**
     * @param requestData
     * @return
     * @throws UnsupportedEncodingException
     */
    public String easpString(String requestData) throws UnsupportedEncodingException {
        if (requestData != null && !requestData.equals("")) {
            String s = "{\"request\":";
            String decode = URLDecoder.decode(requestData, "UTF-8");
            String data1 = decode.substring(0, 11);
            if (!data1.startsWith(s)) {
                throw new RuntimeException("参数【request】缺失异常！");
            } else {
                int closeLen = requestData.length() - 1;
                int openLen = "{\"request\":".length();
                String substring = StringUtils.substring(requestData, openLen, closeLen);
                return substring;
            }
        }
        return "";
    }

    //获取 request的 payload
    public String getBody(InputStream inputStream) throws IOException {
        String body;
        StringBuffer stringBuffer = new StringBuffer();
        BufferedReader bufferedReader = null;
        try {
            if (inputStream != null) {
                bufferedReader = new BufferedReader(new InputStreamReader(inputStream));
                char[] charBuffer = new char[128];
                int bytesRead = -1;
                while ((bytesRead = bufferedReader.read(charBuffer)) > 0) {
                    stringBuffer.append(charBuffer, 0, bytesRead);
                }
            }
        } catch (IOException ex) {
            throw ex;
        } finally {
            if (bufferedReader != null) {
                try {
                    bufferedReader.close();
                } catch (IOException ex) {
                    throw ex;
                }
            }
        }
        body = stringBuffer.toString();
        return body;
    }
}