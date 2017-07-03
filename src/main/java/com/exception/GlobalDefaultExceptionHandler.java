package com.exception;

import javax.servlet.http.HttpServletRequest;

import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;
/**
 * 
 * Title:GlobalDefaultExceptionHandler
 * Description:全局异常解析案例(在类上添加注释@ControllerAdvice,方法上添加注释@ExceptionHandler(value = Exception.class))
 * Company:chaoxing
 * @author:高鹤
 * @date:2017年6月30日
 */
@ControllerAdvice
public class GlobalDefaultExceptionHandler {
	@ResponseBody
	@ExceptionHandler(value = Exception.class)
	public  String  defaultErrorException(HttpServletRequest request,Exception e){
		System.err.println("出错了");
		return e.getMessage();
	}
		
}
