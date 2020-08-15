package com.atrium.javaconfig;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Test {

	public static void main(String[] args) {
		ApplicationContext con = new AnnotationConfigApplicationContext(JavaConfig.class);
		Student s = con.getBean("getStudent", Student.class);
		s.study();

	}

}
