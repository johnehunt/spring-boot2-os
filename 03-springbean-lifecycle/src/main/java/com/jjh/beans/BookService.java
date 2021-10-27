package com.jjh.beans;

import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

@Component
public class BookService {
	
	@PostConstruct
	public void setupBookService() {
		System.out.println("BookService.setupBookService()");
	}
	
	@PreDestroy
	public void clearBookService() {
		System.out.println("BookService.clearBookService()");
	}

}
