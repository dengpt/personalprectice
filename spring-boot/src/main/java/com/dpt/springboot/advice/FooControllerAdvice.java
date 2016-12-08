package com.dpt.springboot.advice;

import javax.servlet.http.HttpServletRequest;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.mvc.method.annotation.ResponseEntityExceptionHandler;

import com.dpt.springboot.controller.UserController;
import com.dpt.springboot.exception.CustomerErrorType;
import com.dpt.springboot.exception.SpringBootException;

@ControllerAdvice(basePackageClasses = UserController.class)
public class FooControllerAdvice extends ResponseEntityExceptionHandler {

	@ExceptionHandler(SpringBootException.class)
	@ResponseBody
	ResponseEntity<?> handleControllerException(HttpServletRequest request, Throwable ex){
		HttpStatus status = getStatus(request);
		System.out.println("==========================handleControllerException=============================");
		return new ResponseEntity<>(new CustomerErrorType(status.value(), ex.getMessage()), status);
	}
	
	private HttpStatus getStatus(HttpServletRequest request){
		Integer statusCode = (Integer)request.getAttribute("javax.servlet.error.status_code");
		if(statusCode == null){
			return HttpStatus.INTERNAL_SERVER_ERROR;
		}
		return HttpStatus.valueOf(statusCode);
	}
}
