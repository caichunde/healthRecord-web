/**
	 * 
	 * @Title: ()   
	 * @Description: TODO()    
	 * @param @param 
	 * @return ReturnMsg    返回类型 
	 * @author hukai
	 * @date 2018年9月26日
	 */
package com.dchb.config;

import java.util.UUID;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.apache.commons.lang3.StringUtils;

import com.dchb.util.ReturnMsg;


/**
 * 
 * @Title: ()   
 * @Description: TODO()    
 * @param @param 
 * @return ReturnMsg    返回类型 
 * @author hukai
 * @date date上午11:01:26
 */
public final class CsrfTokenManager {
	static final String CSRF_PARAM_NAME = "token";
    // session中csrfToken参数名称
    public static final String CSRF_TOKEN_FOR_SESSION_ATTR_NAME = CsrfTokenManager.class
            .getName() + ".tokenval";
 
    private CsrfTokenManager() {
    };
    // 在session中创建csrfToken
    public static String createTokenForSession(HttpSession session) {
        String token = null;
        synchronized (session) {
            token = (String) session
                    .getAttribute(CSRF_TOKEN_FOR_SESSION_ATTR_NAME);
            if (null == token) {
                token = UUID.randomUUID().toString();
                session.setAttribute(CSRF_TOKEN_FOR_SESSION_ATTR_NAME, token);
            }
        }
        return token;
    }
    /**
    	 * 
    	 * @Title: (getTokenFromRequest)   
    	 * @Description: TODO(获取token)    
    	 * @param @param 
    	 * @return ReturnMsg    返回类型 
    	 * @author hukai
    	 * @date 2018年9月26日下午3:45:34
    	 */
    public static String getTokenFromRequest(HttpServletRequest request) {
        return request.getParameter(CSRF_PARAM_NAME);
    }
    
    /**
    	 * 
    	 * @Title: (validToken)   
    	 * @Description: TODO(验证token)    
    	 * @param @param 
    	 * @return ReturnMsg    返回类型 
    	 * @author hukai
    	 * @date 2018年9月26日下午3:45:53
    	 */
    public static ReturnMsg validToken(HttpServletRequest request){
    	 String token = (String) request.getSession().getAttribute(CSRF_TOKEN_FOR_SESSION_ATTR_NAME);
    	 if(StringUtils.isBlank(token)){
    		 return new ReturnMsg(false,"请登录");
    	 }
    	 String reqToken=getTokenFromRequest(request);
    	 if(!token.equals(reqToken)){
    		 return new ReturnMsg(false,"非法操作");
    	 }
    	request.getSession().removeAttribute(CSRF_TOKEN_FOR_SESSION_ATTR_NAME);
    	 return new ReturnMsg(true,"验证成功");
    }
}
