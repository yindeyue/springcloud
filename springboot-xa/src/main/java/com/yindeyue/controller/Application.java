package com.yindeyue.controller;

import javax.transaction.UserTransaction;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;
import org.springframework.transaction.annotation.EnableTransactionManagement;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.yindeyue.mapper1.ShiyanMapper1;
import com.yindeyue.mapper2.ShiyanMapper2;

@SpringBootApplication(exclude = DataSourceAutoConfiguration.class)
@RestController
// @EnableTransactionManagement
public class Application {
	// @Autowired
	// private JdbcTemplate jdbcTemplate;
	@Autowired
	private String string;
	@Autowired
	private ShiyanMapper1 shiyanMapper1;
	@Autowired
	private ShiyanMapper2 shiyanMapper2;

	public static void main(String[] args) {
		SpringApplication.run(Application.class, args);
	}

	@GetMapping("/")
	public String shiyan() {
		return "hello world! ";
	}

	// @GetMapping("mysql")
	// public String jdbc() {
	// jdbcTemplate.execute("insert into shiyan values(1,'hanhexu')");
	// return "ok";
	// }

	@GetMapping("cao")
	public String error() {
		throw new RuntimeException("runtime exception");
	}

	// @GetMapping("shiyan")
	// public Object getShiyan() {
	// Map<String, Object> shiyan = shiyanMapper.getShiyan(1);
	// System.out.println(shiyan);
	// return shiyan;
	// }

	@GetMapping("insert1")
	// @Transactional(transactionManager = "UserTransactionManager")
	@Transactional
	public Object insert1(String name, int id) {
		shiyanMapper1.insertShiyan(id, name);
		 throw new RuntimeException("insert error!");
//		return "ok";
	}

	@GetMapping("insert2")
	// @Transactional(transactionManager = "UserTransactionManager")
	@Transactional
	public Object insert2(String name, int id) {
		shiyanMapper2.insertShiyan(id, name);
		 throw new RuntimeException("insert error!");
//		return "ok";
	}
}
