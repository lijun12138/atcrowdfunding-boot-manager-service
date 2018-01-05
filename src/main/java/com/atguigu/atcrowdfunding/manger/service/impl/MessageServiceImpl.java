package com.atguigu.atcrowdfunding.manger.service.impl;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.atguigu.atcrowdfunding.common.bean.Message;
import com.atguigu.atcrowdfunding.manger.dao.MessageMapper;
import com.atguigu.atcrowdfunding.manger.service.MessageService;

@Service
public class MessageServiceImpl implements MessageService {

	@Autowired
	private MessageMapper messageMapper;
	@Override
	public List<Message> queryPage(Map<String, Object> paramMap) {

		List<Message> datas = messageMapper.queryPage(paramMap);
		return datas;
	}
	@Override
	public Message queryRoleById(Integer id) {
		return messageMapper.selectByPrimaryKey(id);
	}
	@Override
	public Integer updateMessage(Message message) {
		return messageMapper.updateByPrimaryKey(message);
	}
	@Override
	public Integer count(Map<String, Object> paramMap) {
		return messageMapper.count(paramMap);
	}

}
