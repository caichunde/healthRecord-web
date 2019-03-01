package com.dchb.config;

import com.dchb.ErrorCode;
import com.dchb.util.MD5Util;
import com.dchb.util.SendMsgUtil;
import org.apache.commons.lang3.StringUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;
import org.springframework.web.servlet.HandlerInterceptor;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.util.*;

/**
 * @Title: 登录验证拦截处理
 * @Description:
 * @Author: caichunde
 * @Date: 2018-11-30
 */
@Component
public class LoginInterceptor implements HandlerInterceptor {
    // 排除的路径
    private static final Set<String> ALLOWED_PATHS = Collections.unmodifiableSet(new HashSet<>(
            Arrays.asList("/getEmrIchOne")));
    private static final Logger logger = LoggerFactory.getLogger(LoginInterceptor.class);

    //在控制器执行前调用
    public boolean preHandle(HttpServletRequest request,
                             HttpServletResponse response, Object handler) throws Exception {
        HttpSession session = request.getSession();
        String path = request.getRequestURI();

        // 签名验证
        if (excludePath(path)) {
            Object[] o = isSignAndTime(request, response);
            boolean b = (boolean) o[0];
            if (!b) {
                SendMsgUtil.sendJsonMessage(response, o[1].toString());
                return false;
            }
        }
        if (path.contains("sysHealth") || path.contains("druid")) {
            return true;
        }
        Object logPerson = session.getAttribute("logPerson");
        if (null != logPerson) {
            return true;
        }
        SendMsgUtil.sendJsonMessage(response, "请先验证实名登录！");
        return false;
    }

    //在后端控制器执行后调用
    public void postHandle(HttpServletRequest request,
                           HttpServletResponse response,
                           Object handler,
                           ModelAndView modelAndView) throws Exception {
    }

    //整个请求执行完成后调用
    public void afterCompletion(HttpServletRequest request,
                                HttpServletResponse response,
                                Object handler, Exception ex)
            throws Exception {
    }

    // 判断排除的路径
    public boolean excludePath(String requestURI) {
        Iterator iterator = this.ALLOWED_PATHS.iterator();
        while (iterator.hasNext()) {
            String path = (String) iterator.next();
            if (requestURI.contains(path)) {
                return false;
            }
        }
        return true;
    }

    // 签名验证
    public Object[] isSignAndTime(HttpServletRequest request, HttpServletResponse response) {
        // 签名
        response.reset();
        String key = "sdjxkj";
        String requestSign = request.getHeader("sign");
        String time = request.getHeader("time");

        Object[] o = new Object[2];
        o[0] = true;
        if (StringUtils.isBlank(requestSign)) {
            o[0] = false;
            o[1] = ErrorCode.SignErr.getMsg();
            return o;
        }
        if (StringUtils.isBlank(time)) {
            o[0] = false;
            o[1] = ErrorCode.BadReq.getMsg();
            return o;
        }
        long validTime = Long.valueOf(time) + 5 * 60 * 1000;//延时函数，单位毫秒，这里是延时了5分钟
        if (System.currentTimeMillis() >= validTime) {
            o[0] = false;
            o[1] = ErrorCode.ReqTimeOut.getMsg();
            return o;
        }
        String sign = MD5Util.md5(key + time + key).toUpperCase();
        if (!sign.equals(requestSign)) {
            o[0] = false;
            o[1] = ErrorCode.SignErr.getMsg();
            return o;
        }
        return o;
    }
}
