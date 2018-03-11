package com.yindeyue.controller;

import java.util.Map;

import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;

@Mapper
public interface ShiyanMapper {
	@Select("select * from shiyan where id=#{id}")
	public Map<String, Object> getShiyan(@Param("id") int id);

	@Insert("insert into shiyan values(#{id},#{name})")
	public void insertShiyan(@Param("id") int id, @Param("name") String name);
}
