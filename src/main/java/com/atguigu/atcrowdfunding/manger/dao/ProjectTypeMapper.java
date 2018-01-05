package com.atguigu.atcrowdfunding.manger.dao;

import java.util.List;
import java.util.Map;

import com.atguigu.atcrowdfunding.common.bean.Type;

public interface ProjectTypeMapper {

	int deleteByPrimaryKey(Integer id);

	int insert(Type record);

	Type selectByPrimaryKey(Integer id);

	List<Type> selectAll();

	int updateByPrimaryKey(Type record);

	List<Type> queryPage(Map<String, Object> paramMap);

	Integer count(Map<String, Object> paramMap);

	Type checkType(Type type);
}
