package com.atguigu.atcrowdfunding.manger.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.atguigu.atcrowdfunding.common.bean.AccountTypeCert;
import com.atguigu.atcrowdfunding.manger.service.TypeService;

@RestController
public class TypeController {
	
	@Autowired
	private TypeService typeService ;
	
	@RequestMapping("/type/delete")
	int delete(@RequestBody AccountTypeCert atc) {
		return typeService.delete(atc);
	}
	
	@RequestMapping("/type/queryList")
	List<AccountTypeCert> queryList() {
		return typeService.queryList();
	}
	
	@RequestMapping("/type/insert")
	int insert(@RequestBody AccountTypeCert atc) {
		return typeService.insert(atc);
	}
}
