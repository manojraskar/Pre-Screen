package com.restful.contactlist.exception;

public class DataNotFoundException extends RuntimeException{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public DataNotFoundException(String exMessage){
		super(exMessage);
	}
}
