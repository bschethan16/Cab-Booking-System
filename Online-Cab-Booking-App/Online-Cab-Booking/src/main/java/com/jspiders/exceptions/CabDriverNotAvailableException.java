package com.jspiders.exceptions;

public class CabDriverNotAvailableException extends RuntimeException{

	public CabDriverNotAvailableException() {
		
	}
	public CabDriverNotAvailableException(String msg) {
		super(msg);
	}
}
