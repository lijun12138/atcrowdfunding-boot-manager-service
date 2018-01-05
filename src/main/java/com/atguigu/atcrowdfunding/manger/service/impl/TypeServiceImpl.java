package com.atguigu.atcrowdfunding.manger.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.atguigu.atcrowdfunding.common.bean.AccountTypeCert;
import com.atguigu.atcrowdfunding.manger.dao.TypeDao;
import com.atguigu.atcrowdfunding.manger.service.TypeService;

@Service
public class TypeServiceImpl implements TypeService {

	@Autowired
	private TypeDao typeDao;

	@Override
	public List<AccountTypeCert> queryList() {
		return typeDao.quertList();
	}

	@Override
	public int insert(AccountTypeCert atc) {
		return typeDao.insert(atc);
	}

	@Override
	public int delete(AccountTypeCert atc) {
		return typeDao.delete(atc);
	}

}
