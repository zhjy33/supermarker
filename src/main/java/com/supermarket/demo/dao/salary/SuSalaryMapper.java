package com.supermarket.demo.dao.salary;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import com.supermarket.demo.model.salary.SuSalary;

@Mapper
public interface SuSalaryMapper {
    int insert(SuSalary record);

    int insertSelective(SuSalary record);

	List<SuSalary> query();

	void delete(@Param("id")Long id);
}