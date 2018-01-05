package com.atguigu.atcrowdfunding.manger.controller;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.atguigu.atcrowdfunding.common.bean.Param;
import com.atguigu.atcrowdfunding.manger.service.ParamService;

@RestController
public class ParamController {

	@Autowired
	private ParamService paramService;

	@RequestMapping("/param/queryPage")
	List<Param> queryPage(@RequestBody Map<String, Object> paramMap) {
		return paramService.queryPage(paramMap);
	}

	@RequestMapping("/param/queryRoleById")
	Param queryRoleById(@RequestBody Integer id) {
		return paramService.queryRoleById(id);
	}

	@RequestMapping("/param/updateRole")
	Integer updateRole(@RequestBody Param param) {
		return paramService.updateRole(param);
	}

	@RequestMapping("/param/count")
	Integer count(@RequestBody Map<String, Object> paramMap) {
		return paramService.count(paramMap);
	}
}
