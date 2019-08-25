package com.hsbc.exceptions;

public class IDException extends Exception {
	public IDException(String message, Throwable cause) {
		super(message,cause);
	}
	public IDException(String message) {
		super(message);
	}
}
