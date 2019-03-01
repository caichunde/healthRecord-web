package com.dchb.util;

import javax.servlet.http.HttpServletRequest;

import com.dchb.service.sys.SysService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.context.request.RequestContextHolder;
import org.springframework.web.context.request.ServletRequestAttributes;
import org.springframework.web.context.request.WebRequest;

import com.dchb.config.CsrfTokenManager;

public class BaseController {
	protected final Logger logger = LoggerFactory.getLogger(getClass());
	@Autowired
	public SysService sysService;

	/**
	 * 返回成功信息
	 * @param data 传递给前端的数据
	 * @return msg
	 */
	protected ReturnMsg success() {
		return new ReturnMsg(true,"操作成功");
	}
	/**
	 * 返回成功信息
	 * @param data 传递给前端的数据
	 * @return msg
	 */
	protected ReturnMsg success(Object data) {
		return new ReturnMsg(true,data);
	}
	/**
	 * 返回错误提示信息
	 * @param data 传递给前端的数据
	 * @return msg
	 */
	protected ReturnMsg fail(Object data) {
		
		return new ReturnMsg(false,data);
	}
	/**
	 * 判断http请求是否是ajax请求
	 * @param request
	 * @param model
	 */
	@ModelAttribute
	public void ajaxAttribute(WebRequest request, Model model) {
		model.addAttribute("ajaxRequest", AjaxUtils.isAjaxRequest(request));
	}
	//获取request
	public static HttpServletRequest getRequest() {
		ServletRequestAttributes attrs =(ServletRequestAttributes) RequestContextHolder.getRequestAttributes();
		return attrs.getRequest();
	}
	/**
		 * 
		 * @Title: (validCsrf)   
		 * @Description: TODO(这验证csrf)    
		 * @param @param 
		 * @return ReturnMsg    返回类型 
		 * @author hukai
		 * @date 2018年9月26日上午11:00:48
		 */
	public ReturnMsg validCsrf(){
		return CsrfTokenManager.validToken(this.getRequest());
	}
}
