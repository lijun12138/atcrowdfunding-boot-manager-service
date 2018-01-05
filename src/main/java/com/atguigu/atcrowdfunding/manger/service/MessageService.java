package com.atguigu.atcrowdfunding.manger.service;

import java.util.List;
import java.util.Map;

import com.atguigu.atcrowdfunding.common.bean.Message;

public interface MessageService {

	List<Message> queryPage(Map<String, Object> paramMap);

	Message queryRoleById(Integer id);

	Integer updateMessage(Message message);

	Integer count(Map<String, Object> paramMap);

}
