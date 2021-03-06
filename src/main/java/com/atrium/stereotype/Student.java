package com.atrium.stereotype;

import java.util.List;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Component
@Scope("prototype") //Singleton is by default
@NoArgsConstructor
@Getter
@Setter
@ToString
@AllArgsConstructor
public class Student {
	@Value("Ash")
	private String Name;
	@Value("Delhi")
	private String City;
	@Value("#{friends}") //gettings friends list from xml working as reference
	private List<String> friends;
}
