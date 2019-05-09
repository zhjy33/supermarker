package com.supermarket.demo.dao.admin;

import org.apache.ibatis.annotations.Mapper;

import com.supermarket.demo.model.admin.Admin;

@Mapper
public interface AdminMapper {
    int insert(Admin record);

    int insertSelective(Admin record);

	Admin checkAdmin(Admin admin);
}