package com.atrium.auto.wire.annotation;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {
	public static void main(String[] args) {
	ApplicationContext context = new ClassPathXmlApplicationContext("com/atrium/auto/wire/annotation/autoAnnoConfig.xml");
	Emp e1 = (Emp) context.getBean("emp1");
	System.out.println(e1);
	
	
}
}
