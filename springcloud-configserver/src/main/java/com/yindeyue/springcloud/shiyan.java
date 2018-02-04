package com.yindeyue.springcloud;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class shiyan {
@RequestMapping("/")
public String demo(){
	return "hello world";
}
}
