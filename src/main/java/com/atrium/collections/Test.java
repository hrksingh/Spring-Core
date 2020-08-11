package com.atrium.collections;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("com/atrium/collections/constructorBeanConfig.xml");
		Emp emp = (Emp) context.getBean("emp");
		System.out.println(emp);
		((ClassPathXmlApplicationContext) context).close();

	}

}
