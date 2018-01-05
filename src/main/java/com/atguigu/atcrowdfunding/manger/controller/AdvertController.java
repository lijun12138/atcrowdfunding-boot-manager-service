package com.atguigu.atcrowdfunding.manger.controller;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.atguigu.atcrowdfunding.common.bean.Advertisement;
import com.atguigu.atcrowdfunding.manger.service.AdvertService;

@RestController
public class AdvertController {
	
	@Autowired
	private AdvertService advertService;
	
	@RequestMapping("/act/queryPage")
	List<Advertisement> queryPage(@RequestBody Map<String, Object> paramMap){
		return advertService.queryPage(paramMap);
	}

	@RequestMapping("/act/addAdvert")
	Integer addAdvert(@RequestBody Advertisement advert){
		return advertService.addAdvert(advert);
	}

	@RequestMapping("/act/queryRoleById")
	Advertisement queryRoleById(@RequestBody Integer id){
		return advertService.queryRoleById(id);
	}

	@RequestMapping("/act/updateRole")
	Integer updateRole(@RequestBody Advertisement advert){
		return advertService.updateRole(advert);
	}

	@RequestMapping("/act/deleteById")
	Integer deleteById(@RequestBody Integer id){
		return advertService.deleteById(id);
	}

	@RequestMapping("/act/deleteBatch")
	Integer deleteBatch(@RequestBody Integer[] id){
		return advertService.deleteBatch(id);
	}

	@RequestMapping("/act/count")
	Integer count(@RequestBody Map<String, Object> paramMap){
		return advertService.count(paramMap);
	}
}
