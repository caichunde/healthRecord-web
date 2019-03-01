/**
 * @Title: ()
 * @Description: TODO()
 * @param @param
 * @return ReturnMsg    返回类型
 * @author hukai
 * @date 2018年9月20日
 */
package com.dchb.config;

import com.dchb.config.exception.ExceptionResponse;
import com.dchb.config.exception.SignException;
import com.dchb.util.ReturnMsg;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.ResponseStatus;

import javax.servlet.http.HttpServletRequest;
import java.io.IOException;
import java.sql.SQLException;

/**
 * @param @param
 * @author hukai
 * @Title: (GlobalExceptionHandler2)
 * @Description: TODO(异常拦截器)
 * @return ReturnMsg    返回类型
 * @date date下午2:49:31
 */
@ControllerAdvice
public class GlobalExceptionHandler {
    @ExceptionHandler(SQLException.class)
    @ResponseStatus(HttpStatus.INTERNAL_SERVER_ERROR)
    @ResponseBody
    public ExceptionResponse handleSQLException(HttpServletRequest request, Exception ex) {
        String message = ex.getMessage();
        return ExceptionResponse.create(HttpStatus.INTERNAL_SERVER_ERROR.value(), message);
    }

    @ResponseStatus(value = HttpStatus.NOT_FOUND, reason = "IOException occured")
    @ExceptionHandler(IOException.class)
    @ResponseBody
    public void handleIOException() {
        //returning 404 error code  
    }

    @ResponseStatus(HttpStatus.BAD_REQUEST)
    @ResponseBody
    @ExceptionHandler(SignException.class)
    public ExceptionResponse signException(SignException ex) {
        return ex.getEr();
    }

    /**
     * 全局异常捕捉处理
     *
     * @param ex
     * @return
     */
    @ResponseBody
    @ExceptionHandler(value = Exception.class)
    public ReturnMsg errorHandler(Exception ex) {
        return new ReturnMsg(false, ex.getMessage());
    }
}
