package com.supermarket.demo.dao.good;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import com.supermarket.demo.model.good.SuKind;

@Mapper
public interface SuKindMapper {
    int insert(SuKind record);

    int insertSelective(SuKind record);

	List<SuKind> queryKind();

	void delete(@Param("id")Long id);
}