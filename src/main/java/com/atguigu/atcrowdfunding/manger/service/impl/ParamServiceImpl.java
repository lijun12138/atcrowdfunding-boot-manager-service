package com.atguigu.atcrowdfunding.manger.service.impl;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.atguigu.atcrowdfunding.common.bean.Param;
import com.atguigu.atcrowdfunding.manger.dao.ParamMapper;
import com.atguigu.atcrowdfunding.manger.service.ParamService;

@Service
public class ParamServiceImpl implements ParamService {

	@Autowired
	private ParamMapper paramMapper;

	@Override
	public List<Param> queryPage(Map<String, Object> paramMap) {

		List<Param> datas = paramMapper.queryPage(paramMap);
		return datas;
	}

	@Override
	public Param queryRoleById(Integer id) {
		return paramMapper.selectByPrimaryKey(id);
	}

	@Override
	public Integer updateRole(Param param) {
		return paramMapper.updateByPrimaryKey(param);
	}

	@Override
	public Integer count(Map<String, Object> paramMap) {
		return paramMapper.count(paramMap);
	}

}
