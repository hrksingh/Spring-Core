package com.atrium.standlone.collections;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("com/atrium/standlone/collections/standloneConfig.xml");
		Person p = (Person) context.getBean("person");
		System.out.println(p.getFriends().getClass().getSimpleName()); //to show we used LinkedList instead of generic list
		System.out.println(p);

	}

}
