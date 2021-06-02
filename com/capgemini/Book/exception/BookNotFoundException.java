package com.capgemini.Book.exception;

@SuppressWarnings("serial")
public class BookNotFoundException extends Exception {
	
	public BookNotFoundException(String msg){
		super(msg);
	}

}
