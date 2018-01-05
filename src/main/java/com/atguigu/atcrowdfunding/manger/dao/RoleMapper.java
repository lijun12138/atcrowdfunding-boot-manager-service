package com.atguigu.atcrowdfunding.manger.dao;

import java.util.List;
import java.util.Map;

import org.apache.ibatis.annotations.Param;

import com.atguigu.atcrowdfunding.common.bean.Role;

public interface RoleMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(Role record);

    Role selectByPrimaryKey(Integer id);

    List<Role> selectAll();

    int updateByPrimaryKey(Role record);

	List<Role> queryPage(Map<String, Object> paramMap);

	Integer count(Map<String, Object> paramMap);

	Role checkRole(Role role);

	List<Integer> querySelfPermissionByRoleid(Integer id);

	Integer addRolePermission(@Param("idList") List<Integer> idList,@Param("roleid") Integer roleid);

	Integer deleteRolePermissionByid(Integer roleid);

}