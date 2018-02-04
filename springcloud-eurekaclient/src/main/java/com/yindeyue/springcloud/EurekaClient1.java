package com.yindeyue.springcloud;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.DiscoveryClient;
import org.springframework.cloud.client.serviceregistry.Registration;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@EnableEurekaClient
@RestController
public class EurekaClient1 {
	@Autowired
	private Registration registration;
	@Autowired
	private DiscoveryClient discoveryClient;

	public static void main(String[] args) {
		SpringApplication.run(EurekaClient1.class, args);
	}

	@RequestMapping("service")
	public void shiyan() {
		String serviceId = registration.getServiceId();
		System.out.println(discoveryClient.description());
		List<String> services = discoveryClient.getServices();
		System.out.println(services.toString());
	}

	@Value("${server.port}")
	String port;

	@RequestMapping("/hi")
	public String home(@RequestParam String name) {
		return "hi " + name + ",i am from port:" + port;

	}
	@RequestMapping("/shiyan")
	public String shiyan(@RequestParam String name) {
		return "shiyan:"+name;

	}

}
