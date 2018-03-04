package com.yindeyue.service;

import com.weibo.api.motan.config.springsupport.annotation.MotanService;
import com.yindeyue.service.Service2;
@MotanService
public class Service2Impl implements Service2 {

	@Override
	public String SayHello() {
		return "Hello Service2";
	}

	@Override
	public String SayHello(String name) {
		// TODO Auto-generated method stub
		return "Hello Service2 "+name;
	}

}
