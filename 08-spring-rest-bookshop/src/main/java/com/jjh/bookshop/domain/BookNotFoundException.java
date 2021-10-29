package com.jjh.bookshop.domain;

import java.io.Serial;

public class BookNotFoundException extends RuntimeException {

	@Serial
	private static final long serialVersionUID = 1L;
	
	public BookNotFoundException() {
	}

	public BookNotFoundException(String message) {
		super(message);
	}

}
