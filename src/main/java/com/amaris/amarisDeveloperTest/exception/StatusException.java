package com.amaris.amarisDeveloperTest.exception;

public class StatusException extends Exception{
	
	private String status;
	private String message;
	
	public StatusException() {
		
	}
	public StatusException(String status,String message) {
		super("Status: "+ status+ " message: "+ message);
		this.status = status;
		this.message = message;
		
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}
	
	
	
	
	
	
}
