package com.capgemini.Book;

@SuppressWarnings("serial")
public class PriceIsNotValidException extends Exception {
	public PriceIsNotValidException(String msg){
		super(msg);
	}

}
