package com.atrium.connstrutorInjection;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("com/atrium/connstrutorInjection/ciConfig.xml");
		Person p = (Person) context.getBean("person");
		System.out.println(p);
		
		Addition add  = (Addition) context.getBean("add");
		System.out.println(add);
		((ClassPathXmlApplicationContext) context).close();
		

	}

}
