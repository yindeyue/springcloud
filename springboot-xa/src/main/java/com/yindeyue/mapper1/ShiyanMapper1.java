package com.yindeyue.mapper1;

import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

@Mapper
public interface ShiyanMapper1 {
	@Insert("insert into shiyan values(#{id},#{name})")
	public void insertShiyan(@Param("id") int id, @Param("name") String name);
}
