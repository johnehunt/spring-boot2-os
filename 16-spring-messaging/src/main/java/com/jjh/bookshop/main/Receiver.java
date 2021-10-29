package com.jjh.bookshop.main;

import com.jjh.bookshop.domain.Book;
import org.springframework.jms.annotation.JmsListener;
import org.springframework.stereotype.Component;

@Component
public class Receiver {

	public Receiver() {
		System.out.println("Receiver.<init>()");
	}

	@JmsListener(destination = "BookQueue")
	public void receive(Book message) {
		System.out.println("received message: " + message);
	}

}
