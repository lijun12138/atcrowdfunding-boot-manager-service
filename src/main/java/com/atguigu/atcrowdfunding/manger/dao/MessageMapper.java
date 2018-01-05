package com.atguigu.atcrowdfunding.manger.dao;

import java.util.List;
import java.util.Map;

import com.atguigu.atcrowdfunding.common.bean.Message;

public interface MessageMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(Message record);

    Message selectByPrimaryKey(Integer id);

    List<Message> selectAll();

    int updateByPrimaryKey(Message record);

	List<Message> queryPage(Map<String, Object> paramMap);

	Integer count(Map<String, Object> paramMap);
}