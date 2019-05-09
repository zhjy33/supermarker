package com.supermarket.demo.service.good;

import java.util.List;

import com.supermarket.demo.model.good.SuSell;

public interface SellService {

	List<SuSell> querySell();

	void saveSell(SuSell stock);

	void deleteSell(Long id);

}
