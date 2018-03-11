package com.yindeyue.mapper2;

import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

@Mapper
public interface ShiyanMapper2 {
	@Insert("insert into shiyan values(#{id},#{name})")
	public void insertShiyan(@Param("id") int id, @Param("name") String name);
}
