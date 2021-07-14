package com.day04assignment.exception;

public class GetMessage extends RuntimeException {
	@Override
	public String getMessage() {
		return "Stop!!";
	}
	
	public String getDivMsg() {
		return "not possible!";
	}
	
}
