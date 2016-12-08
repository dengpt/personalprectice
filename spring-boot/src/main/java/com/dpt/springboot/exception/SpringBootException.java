package com.dpt.springboot.exception;

public class SpringBootException extends RuntimeException {

	/**
	 * 
	 */
	private static final long serialVersionUID = -2500255993944383891L;

	private String errCode; //异常
	private String message;//
	
	public SpringBootException(String errCode, String message){
		this.errCode = errCode;
		this.message = message;
	}

	public String getErrCode() {
		return errCode;
	}

	public void setErrCode(String errCode) {
		this.errCode = errCode;
	}

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}
	
}
