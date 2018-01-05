package com.atguigu.atcrowdfunding.manger.service.impl;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.atguigu.atcrowdfunding.common.bean.Cert;
import com.atguigu.atcrowdfunding.manger.dao.CertDao;
import com.atguigu.atcrowdfunding.manger.service.CertService;

@Service
public class CertServiceImpl implements CertService {

	@Autowired
	private CertDao certDao;

	@Override
	public List<Cert> queryList(Map<String, Object> paramMap) {
		return certDao.queryList(paramMap);
	}

	@Override
	public Integer count(Map<String, Object> paramMap) {
		return certDao.count(paramMap);
	}

	@Override
	public Integer add(Map<String, Object> paramMap) {
		return certDao.add(paramMap);
	}

	@Override
	public Cert checkCert(Map<String, Object> paramMap) {
		return certDao.checkCert(paramMap);
	}

	@Override
	public Cert queryById(Integer id) {
		return certDao.queryById(id);
	}

	@Override
	public Integer update(Cert cert) {
		return certDao.update(cert);
	}

	@Override
	public Integer delete(Integer id) {
		return certDao.delete(id);
	}

}
