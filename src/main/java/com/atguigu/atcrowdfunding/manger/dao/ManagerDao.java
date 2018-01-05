package com.atguigu.atcrowdfunding.manger.dao;

import java.util.List;
import java.util.Map;

import com.atguigu.atcrowdfunding.common.bean.Permission;
import com.atguigu.atcrowdfunding.common.bean.User;

public interface ManagerDao {

	User queryUserByParam(Map<String, Object> map);

	List<Permission> querySelfPermission(Integer id);

}
