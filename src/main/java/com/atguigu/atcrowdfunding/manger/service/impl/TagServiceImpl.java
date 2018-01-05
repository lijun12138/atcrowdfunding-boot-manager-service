package com.atguigu.atcrowdfunding.manger.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.atguigu.atcrowdfunding.common.bean.Tag;
import com.atguigu.atcrowdfunding.manger.dao.TagMapper;
import com.atguigu.atcrowdfunding.manger.service.TagService;

@Service
public class TagServiceImpl implements TagService {

	@Autowired
	private TagMapper tagMapper;
	
	@Override
	public List<Tag> queryAllTag() {
		return tagMapper.selectAll();
	}
	@Override
	public Integer addTag(Tag tag) {
		return tagMapper.insert(tag);
	}
	@Override
	public Tag queryTagById(Integer id) {
		return tagMapper.selectByPrimaryKey(id);
	}
	@Override
	public Integer updateTag(Tag tag) {
		return tagMapper.updateByPrimaryKey(tag);
	}
	@Override
	public Integer deleteById(Integer id) {
		return tagMapper.deleteByPrimaryKey(id);
	}

}
