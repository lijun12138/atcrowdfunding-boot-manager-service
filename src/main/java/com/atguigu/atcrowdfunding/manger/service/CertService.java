package com.atguigu.atcrowdfunding.manger.service;

import java.util.List;
import java.util.Map;

import com.atguigu.atcrowdfunding.common.bean.Cert;

public interface CertService {

	List<Cert> queryList(Map<String, Object> paramMap);

	Integer count(Map<String, Object> paramMap);

	Integer add(Map<String, Object> paramMap);

	Cert checkCert(Map<String, Object> paramMap);

	Cert queryById(Integer id);

	Integer update(Cert cert);

	Integer delete(Integer id);

}
