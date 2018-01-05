package com.atguigu.atcrowdfunding.manger.service;

import java.util.List;
import java.util.Map;

import com.atguigu.atcrowdfunding.common.bean.User;
import com.atguigu.atcrowdfunding.common.util.Page;

public interface UserService {

	List<User> queryPage(Map<String, Object> paramMap);

	Integer addUser(User user);

	User checkUser(User user);

	User queryUserById(Integer id);

	Integer updateUser(User user);

	Integer deleteById(Integer id);

	Integer deleteBatch(Integer[] ids);

	List<Integer> queryRoleByUserid(Integer userid);

	Integer addRoleById(Integer userid, List<Integer> idList);

	Integer removeRoleById(Integer userid, List<Integer> idList);

	Integer count(Map<String, Object> paramMap);

}
