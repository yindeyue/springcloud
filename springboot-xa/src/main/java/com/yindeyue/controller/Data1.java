package com.yindeyue.controller;

import javax.sql.DataSource;
import javax.transaction.TransactionManager;

import org.apache.ibatis.session.SqlSessionFactory;
import org.mybatis.spring.SqlSessionFactoryBean;
import org.mybatis.spring.SqlSessionTemplate;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.transaction.jta.TransactionFactory;

@Configuration
//@MapperScan(basePackages = "com.yindeyue.mapper1", sqlSessionFactoryRef = "sql1")
public class Data1 {
	/*@Autowired
	@Qualifier("d1")
	private DataSource dataSource;
	@Autowired
	private org.apache.ibatis.transaction.TransactionFactory  transactionFactory;

	@Bean("sql1")
	public SqlSessionFactory getSqlSessionFactory() throws Exception {
		SqlSessionFactoryBean sqlSessionFactoryBean = new SqlSessionFactoryBean();
		sqlSessionFactoryBean.setDataSource(dataSource);
		return sqlSessionFactoryBean.getObject();
	}

	@Bean("sqt1")
	public SqlSessionTemplate getSqlSessionTemplate() throws Exception {
		SqlSessionTemplate sqlSessionTemplate = new SqlSessionTemplate(getSqlSessionFactory());
		return sqlSessionTemplate;
	}*/

}