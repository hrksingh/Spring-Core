package com.atrium.javaconfig;

import org.springframework.stereotype.Component;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Component
@NoArgsConstructor
public class Student {
	@Getter
	@Setter
	private Book book;

	public Student(Book book) {
		super();
		this.book = book;
	}

	public void study() {
		System.out.println("Student is reading " + book.getbook());
	}

}
