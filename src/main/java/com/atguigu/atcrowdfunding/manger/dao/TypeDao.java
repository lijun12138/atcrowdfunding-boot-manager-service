package com.atguigu.atcrowdfunding.manger.dao;

import java.util.List;

import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Select;

import com.atguigu.atcrowdfunding.common.bean.AccountTypeCert;

public interface TypeDao {

	@Select("select * from t_account_type_cert")
	List<AccountTypeCert> quertList();

	@Insert("insert into t_account_type_cert values(null,#{accttype},#{certid})")
	int insert(AccountTypeCert atc);

	@Delete("delete from t_account_type_cert where certid=#{certid} and accttype = #{accttype}")
	int delete(AccountTypeCert atc);

}
