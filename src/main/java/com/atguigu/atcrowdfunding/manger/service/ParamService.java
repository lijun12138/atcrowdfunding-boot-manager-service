package com.atguigu.atcrowdfunding.manger.service;

import java.util.List;
import java.util.Map;

import com.atguigu.atcrowdfunding.common.bean.Param;

public interface ParamService {

	List<Param> queryPage(Map<String, Object> paramMap);

	Param queryRoleById(Integer id);

	Integer updateRole(Param param);

	Integer count(Map<String, Object> paramMap);

}
