package com.atrium.standlone.collections;

import java.util.List;
import java.util.Map;
import java.util.Properties;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
public class Person {
	private List<String> friends;
	private Map<String, Integer> feeStruct;
	private Properties properties;
	

}
