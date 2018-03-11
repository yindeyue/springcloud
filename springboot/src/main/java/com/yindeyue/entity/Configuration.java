package com.yindeyue.entity;

import org.springframework.context.annotation.Bean;

@org.springframework.context.annotation.Configuration
public class Configuration {
	@Bean
	public Person returnPerson() {
		return new Person("yindeyue", 25);
	}
}
