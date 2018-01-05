package com.atguigu.atcrowdfunding.manger.service;

import java.util.List;
import java.util.Map;

import com.atguigu.atcrowdfunding.common.bean.Role;

public interface RoleService {

	List<Role> queryPage(Map<String, Object> paramMap);

	Integer addRole(Role role);

	Role queryRoleById(Integer id);

	Role checkRole(Role role);

	Integer updateRole(Role role);

	Integer deleteById(Integer id);

	Integer deleteBatch(Integer[] id);

	List<Role> queryAllRole();

	List<Integer> querySelfPermissionByRoleid(Integer id);

	Integer addRolePermission(Map<String, Object> paramMap);

	Integer deleteRolePermissionByid(Integer roleid);

	Integer count(Map<String, Object> paramMap);

}
