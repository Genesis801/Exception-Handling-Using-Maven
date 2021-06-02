package com.capgemini.Book.exception;


@SuppressWarnings("serial")
public class BookAlreadyFoundException extends Exception {
	
	public BookAlreadyFoundException(String msg){
		super(msg);
	}

}
