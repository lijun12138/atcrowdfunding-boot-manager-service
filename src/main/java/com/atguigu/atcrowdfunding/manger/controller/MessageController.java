package com.atguigu.atcrowdfunding.manger.controller;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.atguigu.atcrowdfunding.common.bean.Message;
import com.atguigu.atcrowdfunding.manger.service.MessageService;

@RestController
public class MessageController {

	@Autowired
	private MessageService messageService;
	
	@RequestMapping("/message/queryPage")
	List<Message> queryPage(@RequestBody Map<String, Object> paramMap){
		return messageService.queryPage(paramMap);
	}

	@RequestMapping("/message/queryMessageById")
	Message queryMessageById(@RequestBody Integer id){
		return messageService.queryRoleById(id);
	}
	@RequestMapping("/message/updateMessage")
	Integer updateMessage(@RequestBody Message message){
		return messageService.updateMessage(message);
	}

	@RequestMapping("/message/count")
	Integer count(@RequestBody Map<String, Object> paramMap){
		return messageService.count(paramMap);
	}
}
