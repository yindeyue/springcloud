package com.yindeyue.controller;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.yindeyue.entity.Student;

@ConfigurationProperties(prefix="shiyan")
public class Configuration2 {
	private String name;
	private int age;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public Configuration2() {
		super();
		// TODO Auto-generated constructor stub
	}
}
