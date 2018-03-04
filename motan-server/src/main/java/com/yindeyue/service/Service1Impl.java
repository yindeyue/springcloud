package com.yindeyue.service;

import com.weibo.api.motan.config.springsupport.annotation.MotanService;
import com.yindeyue.service.Service1;
@MotanService
public class Service1Impl implements Service1 {

	@Override
	public String SayHello() {
		return "Hello Service1";
	}

	@Override
	public String SayHello(String name) {
		return "Hello Service1 "+name;
	}

}
