package com.atguigu.atcrowdfunding.manger.dao;

import java.util.List;

import com.atguigu.atcrowdfunding.common.bean.Permission;

public interface PermissionMapper {

	int deleteByPrimaryKey(Integer id);

	int insert(Permission record);

	Permission selectByPrimaryKey(Integer id);

	List<Permission> selectAll();

	int updateByPrimaryKey(Permission record);
}