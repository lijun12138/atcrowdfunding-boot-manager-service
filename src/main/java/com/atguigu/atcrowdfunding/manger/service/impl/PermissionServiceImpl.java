package com.atguigu.atcrowdfunding.manger.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.atguigu.atcrowdfunding.common.bean.Permission;
import com.atguigu.atcrowdfunding.manger.dao.PermissionMapper;
import com.atguigu.atcrowdfunding.manger.service.PermissionService;

@Service
public class PermissionServiceImpl implements PermissionService {

	
	@Autowired
	private PermissionMapper permissionMapper;
	@Override
	public List<Permission> queryAll() {
		return permissionMapper.selectAll();
	}
	
	@Override
	public Integer addPermission(Permission permission) {
		return permissionMapper.insert(permission);
	}

	@Override
	public Permission queryPermissionById(Integer id) {
		return permissionMapper.selectByPrimaryKey(id);
	}

	@Override
	public Integer updatePermission(Permission permission) {
		return permissionMapper.updateByPrimaryKey(permission);
	}

	@Override
	public Integer deleteById(Integer id) {
		return permissionMapper.deleteByPrimaryKey(id);
	}

}
