package com.atguigu.atcrowdfunding.manger.service;

import java.util.List;

import com.atguigu.atcrowdfunding.common.bean.Tag;

public interface TagService {

	List<Tag> queryAllTag();

	Integer addTag(Tag tag);

	Tag queryTagById(Integer id);

	Integer updateTag(Tag tag);

	Integer deleteById(Integer id);

}
