package com.atguigu.atcrowdfunding.manger.service;

import java.util.List;
import java.util.Map;

import com.atguigu.atcrowdfunding.common.bean.Permission;
import com.atguigu.atcrowdfunding.common.bean.User;

public interface ManagerService {

	User queryUserByParam(Map<String, Object> map);

	List<Permission> querySelfPermission(Integer id);

}
