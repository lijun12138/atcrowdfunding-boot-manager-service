package com.atguigu.atcrowdfunding.manger.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.atguigu.atcrowdfunding.common.bean.Permission;
import com.atguigu.atcrowdfunding.manger.service.PermissionService;

@RestController
public class PermissionController {

	@Autowired
	private PermissionService permissionService;
	
	@RequestMapping("/permission/queryAll")
	List<Permission> queryAll(){
		return permissionService.queryAll();
	}

	@RequestMapping("/permission/addPermission")
	Integer addPermission(@RequestBody Permission permission) {
		return permissionService.addPermission(permission);
	}

	@RequestMapping("/permission/queryPermissionById")
	Permission queryPermissionById(@RequestBody Integer id) {
		return permissionService.queryPermissionById(id);
	}

	@RequestMapping("/permission/updatePermission")
	Integer updatePermission(@RequestBody Permission permission) {
		return permissionService.updatePermission(permission);
	}

	@RequestMapping("/permission/deleteById")
	Integer deleteById(@RequestBody Integer id) {
		return permissionService.deleteById(id);
	}
}
