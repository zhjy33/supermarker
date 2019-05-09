package com.supermarket.demo.dao.employ;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import com.supermarket.demo.model.employ.SuEmployer;

@Mapper
public interface SuEmployerMapper {
    int insert(SuEmployer record);

    int insertSelective(SuEmployer record);

	List<SuEmployer> queryEmploy();

	void delete(@Param("id")Long id);
}