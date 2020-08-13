package com.atrium.beanlifecycle;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@ToString
public class Pizza {
	private double prize;
	
	private void init() {
		System.out.println("Inside init");

	}
	
	private void destroy() {
		System.out.println("Inside destroy");

	}

}
