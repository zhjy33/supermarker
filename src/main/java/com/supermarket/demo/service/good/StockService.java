package com.supermarket.demo.service.good;

import java.util.List;

import com.supermarket.demo.model.good.SuGoods;
import com.supermarket.demo.model.good.SuStock;

public interface StockService {

	List<SuStock> queryStock();

	void saveStock(SuStock stock);

	void deleteStock(Long id);

	List<SuGoods> stock(SuGoods goods);

}
