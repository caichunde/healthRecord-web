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
 * @Description: TODO(签名异常 )    
 * @param @param 
 * @return ReturnMsg    返回类型 
 * @author hukai
 * @date date下午3:50:41
 */
public class SignException extends Exception{
	private static final long serialVersionUID = 500341178466533822L;
	private String message = "AppKey is not correct, please check.";  
    private Integer code = 10002;  
         
    private ExceptionResponse er;  
     
    public SignException() {  
        er = ExceptionResponse.create(code, message);  
    }  
     
    public ExceptionResponse getEr() {  
        return er;  
    }  
}
