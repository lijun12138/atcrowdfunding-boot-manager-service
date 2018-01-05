package com.atguigu.atcrowdfunding.manger.service.impl;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.atguigu.atcrowdfunding.common.bean.Role;
import com.atguigu.atcrowdfunding.manger.dao.RoleMapper;
import com.atguigu.atcrowdfunding.manger.service.RoleService;

@Service
public class RoleServiceImpl implements RoleService {

	@Autowired
	private RoleMapper roleMapper;

	@Override
	public List<Role> queryPage(Map<String, Object> paramMap) {
		List<Role> datas = roleMapper.queryPage(paramMap);
		return datas;
	}

	@Override
	public Integer count(Map<String, Object> paramMap) {
		return roleMapper.count(paramMap);
	}

	@Override
	public Role checkRole(Role role) {
		return roleMapper.checkRole(role);
	}

	@Override
	public Integer addRole(Role role) {
		return roleMapper.insert(role);
	}

	@Override
	public Role queryRoleById(Integer id) {
		return roleMapper.selectByPrimaryKey(id);
	}

	@Override
	public Integer updateRole(Role role) {
		return roleMapper.updateByPrimaryKey(role);
	}

	@Override
	public Integer deleteById(Integer id) {
		return roleMapper.deleteByPrimaryKey(id);
	}

	@Override
	public Integer deleteBatch(Integer[] ids) {
		int count = 0;
		for (Integer id : ids) {
			int i = roleMapper.deleteByPrimaryKey(id);
			count += i;
		}
		return count;
	}

	@Override
	public List<Role> queryAllRole() {
		return roleMapper.selectAll();
	}

	@Override
	public List<Integer> querySelfPermissionByRoleid(Integer id) {
		return roleMapper.querySelfPermissionByRoleid(id);
	}

	@Override
	public Integer addRolePermission(Map<String, Object> paramMap) {
		return roleMapper.addRolePermission((List<Integer>) paramMap.get("idList"), (Integer) paramMap.get("roleid"));
	}

	@Override
	public Integer deleteRolePermissionByid(Integer roleid) {
		return roleMapper.deleteRolePermissionByid(roleid);
	}

}
