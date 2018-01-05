package com.atguigu.atcrowdfunding.manger.controller;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.atguigu.atcrowdfunding.common.BaseController;
import com.atguigu.atcrowdfunding.common.bean.Cert;
import com.atguigu.atcrowdfunding.manger.service.CertService;


@RestController
@RequestMapping("cert")
public class CertController extends BaseController {
	
	@Autowired
	private CertService certService;

	@RequestMapping("/update")
	public Integer update( @RequestBody Cert cert) {
		return certService.update(cert);
	}
	
	@RequestMapping("/queryById/{id}")
	public Cert queryById(@PathVariable("id") Integer id) {
		return certService.queryById(id);
	}
	
	@RequestMapping("/queryList")
	public List<Cert> queryList(@RequestBody Map<String ,Object> paramMap){
		List<Cert> data = certService.queryList(paramMap);
		return data;
	}
	
	@RequestMapping("/count")
	public Integer count (@RequestBody Map<String ,Object> paramMap) {
		return certService.count(paramMap);
	}
	
	@RequestMapping("/add")
	public Integer add(@RequestBody Map<String ,Object> paramMap) {
		return certService.add(paramMap);
	}
	
	@RequestMapping("/checkCert")
	public Cert checkCert(@RequestBody Map<String ,Object> paramMap) {
		return certService.checkCert(paramMap);
	}
	@RequestMapping("/update/{id}")
	public Integer delete(@PathVariable("id") Integer id) {
		return certService.delete(id);
	}
}
