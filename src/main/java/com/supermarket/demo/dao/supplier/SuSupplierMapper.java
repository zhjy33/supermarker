package com.supermarket.demo.dao.supplier;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import com.supermarket.demo.model.supplier.SuSupplier;

public interface SuSupplierMapper {
    int deleteByPrimaryKey(Long id);

    int insert(SuSupplier record);

    int insertSelective(SuSupplier record);

    int updateByPrimaryKeySelective(SuSupplier record);

    int updateByPrimaryKey(SuSupplier record);

	List<SuSupplier> query();

	void delete(@Param("id")Long id);
}