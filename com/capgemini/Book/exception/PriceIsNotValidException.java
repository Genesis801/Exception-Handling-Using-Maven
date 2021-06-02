package com.capgemini.Book.exception;

@SuppressWarnings("serial")
public class PriceIsNotValidException extends Exception {
	public PriceIsNotValidException(String msg){
		super(msg);
	}

}
