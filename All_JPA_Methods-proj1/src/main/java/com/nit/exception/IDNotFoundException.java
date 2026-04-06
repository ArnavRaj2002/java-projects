package com.nit.exception;

public class IDNotFoundException extends RuntimeException {
	public IDNotFoundException(String msg)
	{
		super(msg);
	}
	public IDNotFoundException()
	{
		super();
	}

}
