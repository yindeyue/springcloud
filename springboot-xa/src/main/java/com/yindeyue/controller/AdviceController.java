package com.yindeyue.controller;

import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;

@ControllerAdvice
public class AdviceController {
	@ExceptionHandler(RuntimeException.class)
	@ResponseBody
	public String error() {
		System.out.println("aaaaaaaaaaaaaaaaaa");
		return "出错啦！";
	}
}
