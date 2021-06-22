package com.libr.mng.book.util;

public final class BookException extends Throwable {

	private String errorCode;
	private String errorDescription;
	
	public void setErrorCode(String errorCode) {
		this.errorCode = errorCode;
	}
	
	public void setErrorDescription(String errorDescription) {
		this.errorDescription = errorDescription;
	}

	public BookException(String errorCode, String errorDescription) {
		super();
		this.errorCode = errorCode;
		this.errorDescription = errorDescription;
	}

	public BookException() {
		
	}
	
	
}
