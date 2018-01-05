package com.atguigu.atcrowdfunding.manger.controller;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.atguigu.atcrowdfunding.common.bean.Type;
import com.atguigu.atcrowdfunding.manger.service.ProjectTypeService;

@RestController
public class ProjectTypeController {

	@Autowired
	private ProjectTypeService projectTypeService;
	
	@RequestMapping("/projectType/queryPage")
	List<Type> queryPage(@RequestBody Map<String, Object> paramMap){
		return projectTypeService.queryPage(paramMap);
	}

	@RequestMapping("/projectType/checkType")
	Type checkType(@RequestBody Type type){
		return projectTypeService.checkType(type);
	}

	@RequestMapping("/projectType/addType")
	Integer addType(@RequestBody Type type){
		return projectTypeService.addType(type);
	}

	@RequestMapping("/projectType/queryRoleById")
	Type queryRoleById(@RequestBody Integer id){
		return projectTypeService.queryRoleById(id);
	}

	@RequestMapping("/projectType/updateRole")
	Integer updateRole(@RequestBody Type type){
		return projectTypeService.updateRole(type);
	}

	@RequestMapping("/projectType/deleteById")
	Integer deleteById(@RequestBody Integer id){
		return projectTypeService.deleteById(id);
	}

	@RequestMapping("/projectType/deleteBatch")
	Integer deleteBatch(@RequestBody Integer[] id){
		return projectTypeService.deleteBatch(id);
	}

	@RequestMapping("/projectType/count")
	Integer count(@RequestBody Map<String, Object> paramMap){
		return projectTypeService.count(paramMap);
	}

}
