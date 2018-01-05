package com.atguigu.atcrowdfunding.manger.dao;

import java.util.List;
import java.util.Map;

import com.atguigu.atcrowdfunding.common.bean.Advertisement;

public interface AdvertisementMapper {

	int deleteByPrimaryKey(Integer id);

	int insert(Advertisement record);

	Advertisement selectByPrimaryKey(Integer id);

	List<Advertisement> selectAll();

	int updateByPrimaryKey(Advertisement record);

	List<Advertisement> queryPage(Map<String, Object> paramMap);

	Integer count(Map<String, Object> paramMap);
}