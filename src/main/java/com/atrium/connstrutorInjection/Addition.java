package com.atrium.connstrutorInjection;

import lombok.ToString;

// to demonstrate Ambiguity
@ToString
public class Addition {
	private int a;
	private int b;
	
	public Addition(int a, int b) {
		super();
		this.a = a;
		this.b = b;
		System.out.println("a "+ this.a);
		System.out.println("b "+this.b);
		System.out.println("int const called");
	}
	
	public Addition(double a, double b) {
		super();
		this.a = (int) a;
		this.b = (int) b;
		
		System.out.println("double const called");
	}
	
	public Addition(String a, String b) {
		super();
		this.a = Integer.parseInt(a);
		this.b = Integer.parseInt(b);
		System.out.println("String const called");
	}
	
	public void sum() {
		System.out.println("Sum is "+(this.a + this.b));
	}

	
}
