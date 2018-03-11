package com.yindeyue.controller;

import javax.sql.DataSource;

import org.springframework.boot.autoconfigure.jdbc.DataSourceBuilder;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;

@Configuration
public class ConfigurationClass {
	@Bean
	public DBConfig1 getDBConfig1() {
		return new DBConfig1();
	}

	@Bean
	public DBConfig2 getDBConfig2() {
		return new DBConfig2();
	}

	@Bean
	public String shiyan() {
		return new String("shiyan");
	}

	@Bean
	@Primary
	public String shiyan2() {
		return new String("shiyan2");
	}

	@Bean
	@ConfigurationProperties(prefix = "spring.datasource.d1")
	public DataSource d1() {
		return DataSourceBuilder.create().build();
	}

	@Bean
	@ConfigurationProperties(prefix = "spring.datasource.d2")
	public DataSource d2() {
		return DataSourceBuilder.create().build();
	}

}
