package com.atguigu.atcrowdfunding.manger.dao;

import java.util.List;
import java.util.Map;

import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;

import com.atguigu.atcrowdfunding.common.bean.Cert;

public interface CertDao {

	@Select("select id, name from t_cert where name like concat('%',#{queryText},'%') order by id asc limit #{startindex},#{pagesize}")
	List<Cert> queryList(Map<String, Object> paramMap);

	@Select("select count(*) from t_cert where name like concat('%',#{queryText},'%')")
	Integer count(Map<String, Object> paramMap);

	@Insert("insert into t_cert values(null,#{name})")
	Integer add(Map<String, Object> paramMap);

	@Select("select id, name from t_cert where name = #{name}")
	Cert checkCert(Map<String, Object> paramMap);

	@Select("select id, name from t_cert where id = #{id}")
	Cert queryById(Integer id);

	@Update("update t_cert set name = #{name} where id = #{id}")
	Integer update(Cert cert);

	@Delete("delete from t_cert where id = #{id}")
	Integer delete(Integer id);

}
