package com.atguigu.atcrowdfunding.manger.service.impl;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.atguigu.atcrowdfunding.common.bean.Type;
import com.atguigu.atcrowdfunding.common.util.Page;
import com.atguigu.atcrowdfunding.manger.dao.ProjectTypeMapper;
import com.atguigu.atcrowdfunding.manger.service.ProjectTypeService;

@Service
public class ProjectTypeServiceImp implements ProjectTypeService {
	@Autowired
	private ProjectTypeMapper projectTypeMapper;

	@Override
	public List<Type> queryPage(Map<String, Object> paramMap) {

		List<Type> datas = projectTypeMapper.queryPage(paramMap);
		return datas;
	}

	@Override
	public Type checkType(Type type) {
		return projectTypeMapper.checkType(type);
	}

	@Override
	public Integer addType(Type type) {
		return projectTypeMapper.insert(type);
	}

	@Override
	public Type queryRoleById(Integer id) {
		return projectTypeMapper.selectByPrimaryKey(id);
	}

	@Override
	public Integer updateRole(Type type) {
		return projectTypeMapper.updateByPrimaryKey(type);
	}

	@Override
	public Integer deleteById(Integer id) {
		return projectTypeMapper.deleteByPrimaryKey(id);
	}

	@Override
	public Integer deleteBatch(Integer[] ids) {
		int count = 0;
		for (Integer id : ids) {
			int i = projectTypeMapper.deleteByPrimaryKey(id);
			count += i;
		}
		return count;
	}


	@Override
	public Integer count(Map<String, Object> paramMap) {
		return projectTypeMapper.count(paramMap);
	}

}
