package com.atguigu.atcrowdfunding.manger.controller;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.atguigu.atcrowdfunding.common.bean.Permission;
import com.atguigu.atcrowdfunding.common.bean.User;
import com.atguigu.atcrowdfunding.manger.service.ManagerService;

@RestController
public class ManagerController {

	@Autowired
	private ManagerService managerService;

	@RequestMapping("/user/queryUserByParam")
	User queryUserByParam(@RequestBody Map<String, Object> map) {
		return managerService.queryUserByParam(map);
	}

	@RequestMapping("/user/querySelfPermission")
	List<Permission> querySelfPermission(@RequestBody Integer id) {
		return managerService.querySelfPermission(id);
	}
}
