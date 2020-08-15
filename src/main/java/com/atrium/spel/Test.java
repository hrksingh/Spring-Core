package com.atrium.spel;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("com/atrium/spel/spelConfig.xml");
		Demo d =context.getBean("demo", Demo.class);
		System.out.println(d);
		

	}

}
