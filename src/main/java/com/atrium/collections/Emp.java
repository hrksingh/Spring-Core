package com.atrium.collections;

import java.util.List;
import java.util.Map;
import java.util.Set;

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
public class Emp {
	
	private String name;
	private List<String> phoneNums;
	private Set<Integer> fiveFavNumbers;
	private Map<String, Integer> courses;	
	
}
