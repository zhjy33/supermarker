package com.supermarket.demo.service.good.impl;

import java.math.BigDecimal;
import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.supermarket.demo.dao.good.SuSellMapper;
import com.supermarket.demo.model.admin.Admin;
import com.supermarket.demo.model.admin.UserHolder;
import com.supermarket.demo.model.good.SuSell;
import com.supermarket.demo.service.good.SellService;
import com.supermarket.demo.util.NumberUtil;

@Service
@Transactional(readOnly = true)
public class SellServiceImpl implements SellService {
	
	@Autowired
	private SuSellMapper sellMapper;
	

	@Override
	public List<SuSell> querySell() {
		// TODO Auto-generated method stub
		List<SuSell> sells = sellMapper.query();
		return sells;
	}

	@Override
	@Transactional(readOnly = false)
	public void saveSell(SuSell stock) {
		// TODO Auto-generated method stub
		Admin user = UserHolder.getUser();
		Long id = NumberUtil.generate10Long();
		Date date = new Date(System.currentTimeMillis());
		
		if(stock.getQty() != null && stock.getPrice() != null) {
			BigDecimal qty = new BigDecimal(stock.getQty());
			stock.setSubTotal(qty.multiply(stock.getPrice()));
		}
		stock.setCreatedBy(user.getId());
		stock.setCreatedTime(date);
		stock.setId(id);
		stock.setIsDelete(false);
		sellMapper.insertSelective(stock);
	}

	@Override
	@Transactional(readOnly = false)
	public void deleteSell(Long id) {
		// TODO Auto-generated method stub
		sellMapper.delete(id);;
	}


}
