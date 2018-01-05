package com.atguigu.atcrowdfunding.manger.dao;

import java.util.List;
import java.util.Map;

import org.apache.ibatis.annotations.Param;

import com.atguigu.atcrowdfunding.common.bean.User;

public interface UserMapper {

	int deleteByPrimaryKey(Integer id);

	int insert(User record);

	User selectByPrimaryKey(Integer id);

	List<User> selectAll();

	int updateByPrimaryKey(User record);

	List<User> queryPage(Map<String, Object> paramMap);

	Integer count(Map<String, Object> paramMap);

	User checkUser(User user);

	List<Integer> queryRoleByUserid(@Param("userid") Integer userid);

	Integer addRoleById(@Param("userid") Integer userid, @Param("idList") List<Integer> idList);

	Integer removeRoleById(@Param("userid") Integer userid, @Param("idList") List<Integer> idList);

}