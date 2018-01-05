package com.atguigu.atcrowdfunding.manger.service;

import java.util.List;

import com.atguigu.atcrowdfunding.common.bean.AccountTypeCert;

public interface TypeService {

	List<AccountTypeCert> queryList();

	int insert(AccountTypeCert atc);

	int delete(AccountTypeCert atc);

}
