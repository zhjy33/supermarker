package com.supermarket.demo.dao.good;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import com.supermarket.demo.model.good.SuGoods;

public interface SuGoodsMapper {
    int deleteByPrimaryKey(Long id);

    int insert(SuGoods record);

    int insertSelective(SuGoods record);

    SuGoods selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(SuGoods record);

    int updateByPrimaryKey(SuGoods record);

	List<SuGoods> queryGoods();
	
	void delete(@Param("id") Long id);

	List<SuGoods> query(SuGoods goods);
}