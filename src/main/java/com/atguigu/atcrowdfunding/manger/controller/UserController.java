package com.atguigu.atcrowdfunding.manger.controller;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.atguigu.atcrowdfunding.common.bean.User;
import com.atguigu.atcrowdfunding.common.util.Page;
import com.atguigu.atcrowdfunding.manger.service.UserService;

@RestController
public class UserController {

	@Autowired
	private UserService userService;

	@RequestMapping("/user/queryPage")
	List<User> queryPage(@RequestBody Map<String, Object> paramMap) {
		return userService.queryPage(paramMap);
	}

	@RequestMapping("/user/count")
	Integer count(@RequestBody Map<String, Object> paramMap) {
		return userService.count(paramMap);
	}
	
	@RequestMapping("/user/addUser")
	Integer addUser(@RequestBody User user) {
		return userService.addUser(user);
	}

	@RequestMapping("/user/checkUser")
	User checkUser(@RequestBody User user) {
		return userService.checkUser(user);
	}

	@RequestMapping("/user/queryUserById")
	User queryUserById(@RequestBody Integer id) {
		return userService.queryUserById(id);
	}

	@RequestMapping("/user/updateUser")
	Integer updateUser(@RequestBody User user) {
		return userService.updateUser(user);
	}

	@RequestMapping("/user/deleteById")
	Integer deleteById(@RequestBody Integer id) {
		return userService.deleteById(id);
	}

	@RequestMapping("/user/deleteBatch")
	Integer deleteBatch(@RequestBody Integer[] ids) {
		return userService.deleteBatch(ids);
	}

	@RequestMapping("/user/queryRoleByUserid")
	List<Integer> queryRoleByUserid(@RequestBody Integer userid) {
		return userService.queryRoleByUserid(userid);
	}

	@RequestMapping("/user/addRoleById")
	Integer addRoleById(@RequestBody Map<String, Object> paramMap) {
		return userService.addRoleById((Integer) paramMap.get("userid"), (List<Integer>) paramMap.get("idList"));
	}

	@RequestMapping("/user/removeRoleById")
	Integer removeRoleById(@RequestBody Map<String, Object> paramMap) {
		return userService.removeRoleById((Integer) paramMap.get("userid"), (List<Integer>) paramMap.get("idList"));
	}

}
