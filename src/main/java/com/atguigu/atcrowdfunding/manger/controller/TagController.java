package com.atguigu.atcrowdfunding.manger.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.atguigu.atcrowdfunding.common.bean.Tag;
import com.atguigu.atcrowdfunding.manger.service.TagService;

@RestController
public class TagController {

	@Autowired
	private TagService tagService;

	@RequestMapping("/tag/queryAllTag")
	List<Tag> queryAllTag() {
		return tagService.queryAllTag();
	}

	@RequestMapping("/tag/addTag")
	Integer addTag(@RequestBody Tag tag) {
		return tagService.addTag(tag);
	}

	@RequestMapping("/tag/queryTagById")
	Tag queryTagById(@RequestBody Integer id) {
		return tagService.queryTagById(id);
	}

	@RequestMapping("/tag/updateTag")
	Integer updateTag(@RequestBody Tag tag) {
		return tagService.updateTag(tag);
	}

	@RequestMapping("/tag/deleteById")
	Integer deleteById(@RequestBody Integer id) {
		return tagService.deleteById(id);
	}
}
