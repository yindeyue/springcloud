package com.yindeyue.springcloud;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.config.environment.Environment;
import org.springframework.cloud.config.environment.PropertySource;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class ConfigClientApplication {

	public static void main(String[] args) {
		SpringApplication.run(ConfigClientApplication.class, args);
	}

	@Value("${shiyan}")
	private String asd;
	@Value("${shiyan-bootstrap}")
	private String asd2;
	@Value("${shiyan-shiyan}")
//	private String asd3="aaa";
	private String asd3;
//	@Value("${shiyan.name}")
//	private String name;
	@RequestMapping("/hi")
	public String name() {
		String result=asd+"|"+asd2+"|"+asd3;
		return result;
	}

}
