package com.yindeyue.controller;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.weibo.api.motan.config.springsupport.BasicRefererConfigBean;
import com.weibo.api.motan.config.springsupport.BasicServiceConfigBean;
import com.weibo.api.motan.config.springsupport.ProtocolConfigBean;
import com.weibo.api.motan.config.springsupport.RegistryConfigBean;
import com.weibo.api.motan.config.springsupport.annotation.MotanReferer;
import com.yindeyue.service.Service1;
import com.yindeyue.service.Service2;

@SpringBootApplication
@RestController
public class Application {
	@MotanReferer
	private Service1 service1;
	@MotanReferer
	private Service2 service2;

	public static void main(String[] args) {
		SpringApplication.run(Application.class, args);
	}

	@GetMapping("service1")
	public String service1() {
		return "Hello Service1";
	}

	@GetMapping("service1ByName")
	public String service1(String name) {
		return "Hello Service1:" + name;
	}

	@GetMapping("service2")
	public String service2() {
		return "Hello Service2";
	}

	@GetMapping("service2ByName")
	public String service2(String name) {
		return "Hello Service2:" + name;
	}

	@GetMapping("shiyan")
	public String shiyan() {
		return "client: shiyan";
	}

	@Bean(name = "registry")
	public RegistryConfigBean registryConfig() {
		RegistryConfigBean config = new RegistryConfigBean();
		config.setRegProtocol("zookeeper");
		config.setAddress("127.0.0.1");
		config.setPort(2181);
		config.setRequestTimeout(6000);
		config.setConnectTimeout(6000);
		config.setRegistryRetryPeriod(6000);
		return config;
	}

	@Bean(name = "motan")
	public ProtocolConfigBean protocolConfig() {
		ProtocolConfigBean config = new ProtocolConfigBean();
		config.setDefault(true);
		config.setName("motan");
		config.setMaxContentLength(1048576);
		return config;
	}

	@Bean
	public BasicRefererConfigBean baseServiceConfig() {
		BasicRefererConfigBean config = new BasicRefererConfigBean();
		config.setProtocol("motan");
		config.setRegistry("registry");
		config.setRequestTimeout(6000);
		return config;
	}
}
