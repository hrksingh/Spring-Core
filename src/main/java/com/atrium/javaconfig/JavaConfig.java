package com.atrium.javaconfig;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class JavaConfig {
	
	@Bean
	public Book getbook() {
		return new Book();
		
	}
	
	@Bean
	public Student getStudent() {
		Student student = new Student(getbook());
		return student;
		
	}

}
 