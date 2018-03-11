package com.yindeyue.controller;

import javax.sql.DataSource;

import org.apache.ibatis.session.SqlSessionFactory;
import org.mybatis.spring.SqlSessionFactoryBean;
import org.mybatis.spring.SqlSessionTemplate;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
//@MapperScan(basePackages = "com.yindeyue.mapper2", sqlSessionFactoryRef = "sql2")
public class Data2 {

	/*@Autowired
	@Qualifier("d2")
	private DataSource dataSource2;

	@Bean("sql2")
	public SqlSessionFactory getSqlSessionFactory2() throws Exception {
		SqlSessionFactoryBean sqlSessionFactoryBean = new SqlSessionFactoryBean();
		sqlSessionFactoryBean.setDataSource(dataSource2);
		return sqlSessionFactoryBean.getObject();
	}

	@Bean("sqt2")
	public SqlSessionTemplate getSqlSessionTemplate2() throws Exception {
		SqlSessionTemplate sqlSessionTemplate = new SqlSessionTemplate(getSqlSessionFactory2());
		return sqlSessionTemplate;
	}*/
}
