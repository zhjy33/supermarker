package com.supermarket.demo.service.supplier.impl;

import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.supermarket.demo.dao.supplier.SuSupplierMapper;
import com.supermarket.demo.model.admin.Admin;
import com.supermarket.demo.model.admin.UserHolder;
import com.supermarket.demo.model.good.SuGoods;
import com.supermarket.demo.model.supplier.SuSupplier;
import com.supermarket.demo.service.supplier.SupplierService;
import com.supermarket.demo.util.NumberUtil;

@Service
@Transactional(readOnly = false)
public class SupplierServiceImpl implements SupplierService {

	@Autowired
	private SuSupplierMapper supplierMapper;
	
	
	public List<SuSupplier> querySupplier() {
		// TODO Auto-generated method stub
		List<SuSupplier> suppliers = supplierMapper.query();
		return suppliers;
	}

	@Override
	public void saveSupplier(SuSupplier supplier) {
		// TODO Auto-generated method stub
		Admin user = UserHolder.getUser();
		Long id = NumberUtil.generate10Long();
		Date date = new Date(System.currentTimeMillis());
		
		supplier.setCreatedBy(user.getId());
		supplier.setCreatedDate(date);
		supplier.setId(id);
		supplier.setIsDelete(false);
		supplierMapper.insertSelective(supplier);
	}

	@Override
	public void deleteSupplier(Long id) {
		// TODO Auto-generated method stub
		supplierMapper.delete(id);
	}

}
