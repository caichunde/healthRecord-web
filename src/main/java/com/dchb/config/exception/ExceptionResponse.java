/**
	 * 
	 * @Title: ()   
	 * @Description: TODO()    
	 * @param @param 
	 * @return ReturnMsg    返回类型 
	 * @author hukai
	 * @date 2018年9月20日
	 */
package com.dchb.config.exception;

/**
 * 
 * @Title: ()   
 * @Description: TODO()    
 * @param @param 
 * @return ReturnMsg    返回类型 
 * @author hukai
 * @date date下午3:48:55
 */
public class ExceptionResponse {
    private String message;  
    private Integer code;  
     
    /** 
     * Construction Method 
     * @param code 
     * @param message 
     */  
    public ExceptionResponse(Integer code, String message){  
        this.message = message;  
        this.code = code;  
    }  
     
    public static ExceptionResponse create(Integer code, String message){  
        return new ExceptionResponse(code, message);  
    }  
     
    public Integer getCode() {  
        return code;  
    }  
    public String getMessage() {  
        return message;  
    }
}
