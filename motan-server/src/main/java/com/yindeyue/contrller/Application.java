package com.yindeyue.contrller;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.weibo.api.motan.config.springsupport.BasicServiceConfigBean;
import com.weibo.api.motan.config.springsupport.ProtocolConfigBean;
import com.weibo.api.motan.config.springsupport.RegistryConfigBean;

@SpringBootApplication
@RestController
public class Application {
	public static void main(String[] args) {
		SpringApplication.run(Application.class, args);
	}

	@GetMapping("shiyan")
	public String shiyan() {
		return "server: shiyan";
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
	public BasicServiceConfigBean baseServiceConfig() {
		BasicServiceConfigBean config = new BasicServiceConfigBean();
		config.setExport("motan:" + 9000);
		config.setRegistry("registry");
		config.setRequestTimeout(6000);
		return config;
	}
}
