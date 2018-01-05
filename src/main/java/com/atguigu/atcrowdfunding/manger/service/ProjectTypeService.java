package com.atguigu.atcrowdfunding.manger.service;

import java.util.List;
import java.util.Map;

import com.atguigu.atcrowdfunding.common.bean.Type;

public interface ProjectTypeService {

	List<Type> queryPage(Map<String, Object> paramMap);

	Type checkType(Type type);

	Integer addType(Type type);

	Type queryRoleById(Integer id);

	Integer updateRole(Type type);

	Integer deleteById(Integer id);

	Integer deleteBatch(Integer[] id);

	Integer count(Map<String, Object> paramMap);

}
