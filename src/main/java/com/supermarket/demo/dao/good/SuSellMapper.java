package com.supermarket.demo.dao.good;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import com.supermarket.demo.model.good.SuSell;

@Mapper
public interface SuSellMapper {
    int insert(SuSell record);

    int insertSelective(SuSell record);

	void delete(@Param("id")Long id);

	List<SuSell> query();

	Integer queryByGoodsId(@Param("id")Long id);
}