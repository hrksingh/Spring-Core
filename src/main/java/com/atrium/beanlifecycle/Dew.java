package com.atrium.beanlifecycle;

import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;

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
public class Dew implements InitializingBean,DisposableBean{
	private double prize;

	@Override
	public void afterPropertiesSet() throws Exception {
		System.out.println("working as init");
		
	}

	@Override
	public void destroy() throws Exception {
		System.out.println("working as destory");
		
	}
	

}
