package com.atguigu.atcrowdfunding.manger.controller;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.atguigu.atcrowdfunding.common.bean.Role;
import com.atguigu.atcrowdfunding.manger.service.RoleService;

@RestController
public class RoleController {

	@Autowired
	private RoleService roleService;

	@RequestMapping("/role/queryPage")
	List<Role> queryPage(@RequestBody Map<String, Object> paramMap) {
		return roleService.queryPage(paramMap);
	}

	@RequestMapping("/role/count")
	Integer count(@RequestBody Map<String, Object> paramMap) {
		return roleService.count(paramMap);
	}

	@RequestMapping("/role/addRole")
	Integer addRole(@RequestBody Role role) {
		return roleService.addRole(role);
	}

	@RequestMapping("/role/queryRoleById")
	Role queryRoleById(@RequestBody Integer id) {
		return roleService.queryRoleById(id);
	}

	@RequestMapping("/role/checkRole")
	Role checkRole(@RequestBody Role role) {
		return roleService.checkRole(role);
	}

	@RequestMapping("/role/updateRole")
	Integer updateRole(@RequestBody Role role) {
		return roleService.updateRole(role);
	}

	@RequestMapping("/role/deleteById")
	Integer deleteById(@RequestBody Integer id) {
		return roleService.deleteById(id);
	}

	@RequestMapping("/role/deleteBatch")
	Integer deleteBatch(@RequestBody Integer[] id) {
		return roleService.deleteBatch(id);
	}

	@RequestMapping("/role/queryAllRole")
	List<Role> queryAllRole() {
		return roleService.queryAllRole();
	}

	@RequestMapping("/role/querySelfPermissionByRoleid")
	List<Integer> querySelfPermissionByRoleid(@RequestBody Integer id) {
		return roleService.querySelfPermissionByRoleid(id);
	}

	@RequestMapping("/role/addRolePermission")
	Integer addRolePermission(@RequestBody Map<String, Object> paramMap) {
		return roleService.addRolePermission(paramMap);
	}

	@RequestMapping("/role/deleteRolePermissionByid")
	Integer deleteRolePermissionByid(@RequestBody Integer roleid) {
		return roleService.deleteRolePermissionByid(roleid);
	}

}
