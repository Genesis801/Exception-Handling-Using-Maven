package com.capgemini.Book.exception;

@SuppressWarnings("serial")
public class BookNameCannotBeNull extends Exception {

	public BookNameCannotBeNull(String msg){
		super(msg);
	}

}
