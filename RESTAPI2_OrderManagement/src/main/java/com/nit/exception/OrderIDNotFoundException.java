package com.nit.exception;

public class OrderIDNotFoundException extends RuntimeException{

private static final long serialVersionUID = 1L;
public OrderIDNotFoundException()
{
	super();
}
public OrderIDNotFoundException(String msg)
{
	super(msg);
}
}
