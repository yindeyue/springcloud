package com.yindeyue.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Import;
import org.springframework.context.annotation.ImportResource;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.weibo.api.motan.config.springsupport.annotation.MotanReferer;
import com.yindeyue.entity.Configuration;
import com.yindeyue.entity.Person;
import com.yindeyue.entity.Student;
import com.yindeyue.entity.Teacher;
import com.yindeyue.service.Service1;
import com.yindeyue.service.Service2;

@SpringBootApplication
@RestController
//@Import(Configuration.class)
//@ImportResource(locations = "application2.xml")
public class Demo {
//	@Autowired
//	private Person person;
//	@Value("${shiyan}")
//	private String shiyan;
//	@Autowired
//	private Teacher teacher;
	@MotanReferer
	private Service1 service1;
	@MotanReferer
	private Service2 service2;
	public static void main(String[] args) {
		SpringApplication.run(Demo.class, args);
	}

	@GetMapping("shiyan")
	public String shiyan() {
		return "shiyan";
//		System.out.println(shiyan);
//		System.out.println(person);
//		System.out.println(teacher);
	}
	@GetMapping("service1")
	public String service1(){
		return service1.SayHello();
	}
	@GetMapping("service1ByName")
	public String service1(String name){
		return service1.SayHello(name);
	}
	@GetMapping("service2")
	public String service2(){
		return service2.SayHello();
	}
	@GetMapping("service2ByName")
	public String service2(String name){
		return service2.SayHello(name);
	}
}
