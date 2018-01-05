package com.atguigu.atcrowdfunding.manger.service.impl;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.atguigu.atcrowdfunding.common.bean.Advertisement;
import com.atguigu.atcrowdfunding.manger.dao.AdvertisementMapper;
import com.atguigu.atcrowdfunding.manger.service.AdvertService;

@Service
public class AdvertServiceImpl implements AdvertService {

	@Autowired
	private AdvertisementMapper advertMapper;

	@Override
	public List<Advertisement> queryPage(Map<String, Object> paramMap) {

		List<Advertisement> datas = advertMapper.queryPage(paramMap);
		return datas;
	}

	@Override
	public Integer addAdvert(Advertisement advert) {
		return advertMapper.insert(advert);
	}

	@Override
	public Advertisement queryRoleById(Integer id) {
		return advertMapper.selectByPrimaryKey(id);
	}

	@Override
	public Integer updateRole(Advertisement advert) {
		return advertMapper.updateByPrimaryKey(advert);
	}

	@Override
	public Integer deleteById(Integer id) {
		return advertMapper.deleteByPrimaryKey(id);
	}

	@Override
	public Integer deleteBatch(Integer[] ids) {
		int count = 0;
		for (Integer id : ids) {
			int i = advertMapper.deleteByPrimaryKey(id);
			count+=i;
		}
		return count;
	}


	@Override
	public Integer count(Map<String, Object> paramMap) {
		return advertMapper.count(paramMap);
	}

}
