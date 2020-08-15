package com.atrium.spel;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Component
@NoArgsConstructor
@Getter
@Setter
@ToString
public class Demo {
	
	@Value("#{23+435}") //simple expression
	private int x;
	@Value("#{211+5+234}")
	private int y;
	@Value("#{ T(java.lang.Math).sqrt(141) }") //calling static method of class
	private int z;
	@Value("#{T(java.lang.Math).E}") //calling constant of class
	private double e;
	@Value("#{ new java.lang.String('Ash')}") //how to make object in spring expression language
	private String name;
	@Value("#{2>0}")  //boolean example #sample expression that evaluate to true , so give condition according to need
	private boolean isActive;

}
