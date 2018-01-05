package com.atguigu.atcrowdfunding.manger.dao;

import java.util.List;

import com.atguigu.atcrowdfunding.common.bean.Tag;

public interface TagMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(Tag record);

    Tag selectByPrimaryKey(Integer id);

    List<Tag> selectAll();

    int updateByPrimaryKey(Tag record);
}