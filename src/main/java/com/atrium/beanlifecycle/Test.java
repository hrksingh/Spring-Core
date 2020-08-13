package com.atrium.beanlifecycle;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

	public static void main(String[] args) {
		AbstractApplicationContext context = new ClassPathXmlApplicationContext("com/atrium/beanlifecycle/beanLifecycleConfig.xml");
		Pizza p = (Pizza) context.getBean("pizza");
		System.out.println(p);
		context.registerShutdownHook();
		
		System.out.println("+++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++");
		Dew d = (Dew) context.getBean("dew");
		System.out.println(d);
		
		System.out.println("+++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++");
		Browny b = (Browny) context.getBean("browny");
		System.out.println(b);
		
		((ClassPathXmlApplicationContext) context).close();

	}

}
