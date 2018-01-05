package com.atguigu.atcrowdfunding.manger.service;

import java.util.List;

import com.atguigu.atcrowdfunding.common.bean.Permission;

public interface PermissionService {

	List<Permission> queryAll();

	Integer addPermission(Permission permission);

	Permission queryPermissionById(Integer id);

	Integer updatePermission(Permission permission);

	Integer deleteById(Integer id);

}
