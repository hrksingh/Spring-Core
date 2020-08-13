package com.atrium.beanlifecycle;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

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
public class Browny {
	private double prize;
	
	@PostConstruct
	private void start() {
		System.out.println("init for browny");
	}

	@PreDestroy
	private void end() {
		System.out.println("destroy for browny");

	}
}
