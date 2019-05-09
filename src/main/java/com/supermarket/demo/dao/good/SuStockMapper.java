package com.supermarket.demo.dao.good;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import com.supermarket.demo.model.good.SuStock;

@Mapper
public interface SuStockMapper {
    int insert(SuStock record);

    int insertSelective(SuStock record);

	void delete(@Param("id")Long id);

	List<SuStock> query();

	Integer queryByGoodsId(@Param("id")Long id);
}