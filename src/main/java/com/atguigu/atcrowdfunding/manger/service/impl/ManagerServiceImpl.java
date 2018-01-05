package com.atguigu.atcrowdfunding.manger.service.impl;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.atguigu.atcrowdfunding.common.bean.Permission;
import com.atguigu.atcrowdfunding.common.bean.User;
import com.atguigu.atcrowdfunding.common.util.MD5Util;
import com.atguigu.atcrowdfunding.manger.dao.ManagerDao;
import com.atguigu.atcrowdfunding.manger.service.ManagerService;

@Service 
public class ManagerServiceImpl implements ManagerService {

	@Autowired
	private ManagerDao managerDao;

	@Override
	public User queryUserByParam(Map<String, Object> map) {
		String userpswd = (String) map.get("userpswd");
		String md5pswd = MD5Util.digest(userpswd);
		map.put("userpswd", md5pswd);
		return managerDao.queryUserByParam(map);
	}

	@Override
	public List<Permission> querySelfPermission(Integer id) {
		return managerDao.querySelfPermission(id);
	}


}
