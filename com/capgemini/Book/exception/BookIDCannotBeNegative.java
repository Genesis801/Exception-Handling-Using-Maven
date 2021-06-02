package com.capgemini.Book.exception;

@SuppressWarnings("serial")
public class BookIDCannotBeNegative extends Exception {
	public BookIDCannotBeNegative(String msg){
		super(msg);
	}

}
