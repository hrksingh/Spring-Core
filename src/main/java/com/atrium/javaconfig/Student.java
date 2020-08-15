package com.atrium.javaconfig;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Component
@NoArgsConstructor
public class Student {
	@Autowired
	@Getter
	@Setter
	private Book book;


	public void study() {
		System.out.println("Student is reading " + book.getbook());
	}

}
