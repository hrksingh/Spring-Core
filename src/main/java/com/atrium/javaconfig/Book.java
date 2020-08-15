package com.atrium.javaconfig;

import org.springframework.stereotype.Component;

import lombok.NoArgsConstructor;

@Component
@NoArgsConstructor
public class Book {
	
	public String getbook() {
		return "Java Programming with Ash";
	}

}
