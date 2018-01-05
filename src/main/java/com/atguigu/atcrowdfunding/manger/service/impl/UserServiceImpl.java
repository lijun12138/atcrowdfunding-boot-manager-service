package com.atguigu.atcrowdfunding.manger.service.impl;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.atguigu.atcrowdfunding.common.bean.User;
import com.atguigu.atcrowdfunding.common.util.Const;
import com.atguigu.atcrowdfunding.common.util.MD5Util;
import com.atguigu.atcrowdfunding.common.util.Page;
import com.atguigu.atcrowdfunding.manger.dao.UserMapper;
import com.atguigu.atcrowdfunding.manger.service.UserService;

@Service
public class UserServiceImpl implements UserService {

	@Autowired
	private UserMapper userMapper;

	@Override
	public List<User> queryPage(Map<String, Object> paramMap) {
		List<User> datas = userMapper.queryPage(paramMap);
		return datas;
	}

	@Override
	public Integer count(Map<String, Object> paramMap) {
		return userMapper.count(paramMap);
	}

	@Override
	public Integer addUser(User user) {
		SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
		String format = simpleDateFormat.format(new Date());

		user.setUserpswd(MD5Util.digest(Const.USER_PSWD));
		user.setCreatetime(format);
		return userMapper.insert(user);
	}

	@Override
	public User checkUser(User user) {
		return userMapper.checkUser(user);
	}

	@Override
	public User queryUserById(Integer id) {

		return userMapper.selectByPrimaryKey(id);
	}

	@Override
	public Integer updateUser(User user) {
		return userMapper.updateByPrimaryKey(user);
	}

	@Override
	public Integer deleteById(Integer id) {
		return userMapper.deleteByPrimaryKey(id);
	}

	@Override
	public Integer deleteBatch(Integer[] ids) {
		int count = 0;
		for (Integer id : ids) {
			int i = userMapper.deleteByPrimaryKey(id);
			count += i;
		}
		return count;
	}

	@Override
	public List<Integer> queryRoleByUserid(Integer userid) {
		return userMapper.queryRoleByUserid(userid);
	}

	@Override
	public Integer addRoleById(Integer userid, List<Integer> idList) {
		return userMapper.addRoleById(userid, idList);
	}

	@Override
	public Integer removeRoleById(Integer userid, List<Integer> idList) {
		return userMapper.removeRoleById(userid, idList);
	}

}
