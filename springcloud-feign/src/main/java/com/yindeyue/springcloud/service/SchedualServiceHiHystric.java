package com.yindeyue.springcloud.service;

import org.springframework.stereotype.Component;

@Component
public class SchedualServiceHiHystric implements SchedualServiceHi{

	@Override
	public String sayHiFromClientOne(String name) {
		
		return name+"sorry!";
	}

}
