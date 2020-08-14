package com.atrium;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App {
	public static void main(String[] args) {
		
		ApplicationContext context = new ClassPathXmlApplicationContext("com/atrium/beanConfig.xml");
		Student student = (Student) context.getBean("student");
		Student student1 = (Student) context.getBean("student1");
		Student student2 = (Student) context.getBean("student2");
		System.out.println(student);
		System.out.println(student1);
		System.out.println(student2);
		
		((ClassPathXmlApplicationContext) context).close();//this is to avoid context resource leak
		
		/**
		 * We can also use try with resources but then we have to use ClassPathXmlApplicationContext instead of ApplicationContext
		 * as it does not implement Auto-closable
		 * At the end its your choice 
		 */

	}
}
