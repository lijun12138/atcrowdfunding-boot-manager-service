package com.atguigu.atcrowdfunding.manger.dao;

import java.util.List;
import java.util.Map;

import com.atguigu.atcrowdfunding.common.bean.Param;

public interface ParamMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(Param record);

    Param selectByPrimaryKey(Integer id);

    List<Param> selectAll();

    int updateByPrimaryKey(Param record);

	List<Param> queryPage(Map<String ,Object>paramMap);

	Integer count();

	Integer count(Map<String, Object> paramMap);
}