package com.supermarket.demo.service.good;

import java.util.List;

import com.supermarket.demo.model.good.SuGoods;
import com.supermarket.demo.model.good.SuKind;

public interface GoodService {
	
	String empty = "无";

	List<SuKind> queryKind();

	void saveKind(SuKind kind);

	void delete(Long id);

	List<SuGoods> queryGoods();

	void saveGoods(SuGoods goods);

	void deleteGoods(Long id);

}
