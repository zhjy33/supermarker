package com.supermarket.demo.service.good.impl;

import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.supermarket.demo.dao.good.SuGoodsMapper;
import com.supermarket.demo.dao.good.SuSellMapper;
import com.supermarket.demo.dao.good.SuStockMapper;
import com.supermarket.demo.model.admin.Admin;
import com.supermarket.demo.model.admin.UserHolder;
import com.supermarket.demo.model.good.SuGoods;
import com.supermarket.demo.model.good.SuStock;
import com.supermarket.demo.service.good.StockService;
import com.supermarket.demo.util.NumberUtil;

@Service
@Transactional(readOnly = true)
public class StockServiceImpl implements StockService {

	@Autowired
	private SuStockMapper stockMapper;
	
	@Autowired
	private SuGoodsMapper goodsMapper;
	
	@Autowired
	private SuSellMapper sellMapper;

	@Override
	public List<SuStock> queryStock() {
		// TODO Auto-generated method stub
		List<SuStock> stocks = stockMapper.query();
		return stocks;
	}

	@Override
	@Transactional(readOnly = false)
	public void saveStock(SuStock stock) {
		// TODO Auto-generated method stub
		Admin admin = UserHolder.getUser();
		Long id = NumberUtil.generate10Long();
		Date date = new Date(System.currentTimeMillis());
		
		stock.setCreatedDate(date);
		stock.setId(id);
		stock.setCreatedBy(admin.getId());
		stock.setIsDelete(false);
		stockMapper.insertSelective(stock);
	}

	@Override
	@Transactional(readOnly = false)
	public void deleteStock(Long id) {
		// TODO Auto-generated method stub
		stockMapper.delete(id);
	}

	@Override
	public List<SuGoods> stock(SuGoods goods) {
		// TODO Auto-generated method stub
		List<SuGoods> remainGoods = goodsMapper.query(goods);
		for (SuGoods good : remainGoods) {
			Integer sellCount = sellMapper.queryByGoodsId(good.getId());
			Integer stockCount = stockMapper.queryByGoodsId(good.getId());
			if(sellCount != null && stockCount != null) {
				if(sellCount >= stockCount) {
					good.setRemainQty(0);
				}else {
					good.setRemainQty(stockCount - sellCount);
					}
			}else if(sellCount == null && stockCount != null) {
				good.setRemainQty(stockCount);
			}else {
				good.setRemainQty(0);
			}
		}
		return remainGoods;
	}


}
