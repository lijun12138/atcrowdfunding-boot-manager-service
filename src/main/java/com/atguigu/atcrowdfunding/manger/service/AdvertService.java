package com.atguigu.atcrowdfunding.manger.service;

import java.util.List;
import java.util.Map;

import com.atguigu.atcrowdfunding.common.bean.Advertisement;

public interface AdvertService {

	List<Advertisement> queryPage(Map<String, Object> paramMap);

	Integer addAdvert(Advertisement advert);

	Advertisement queryRoleById(Integer id);

	Integer updateRole(Advertisement advert);

	Integer deleteById(Integer id);

	Integer deleteBatch(Integer[] id);

	Integer count(Map<String, Object> paramMap);

}
