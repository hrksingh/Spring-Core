package com.atrium.objectReferrenceExample;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("com/atrium/objectReferrenceExample/refBeanConfig.xml");
		
		A obj = (A) context.getBean("aref");
		
		System.out.println(obj.getX());
		System.out.println(obj.getBObj().getY());
		System.out.println(obj);
		
		((ClassPathXmlApplicationContext) context).close();

	}

}
