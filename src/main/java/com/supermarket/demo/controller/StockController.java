package com.supermarket.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.supermarket.demo.model.good.SuGoods;
import com.supermarket.demo.model.good.SuKind;
import com.supermarket.demo.model.good.SuStock;
import com.supermarket.demo.service.good.GoodService;
import com.supermarket.demo.service.good.StockService;

@Controller
@RequestMapping("/stock")
public class StockController {

	@Autowired
	private  StockService stockService;
	
	
	@RequestMapping("/search-page")
	public String list(ModelMap model) {
		return "list/search";
	}
	
	@RequestMapping(method = RequestMethod.POST,value = "/search")
	public String toAdd(SuGoods goods,ModelMap model) {
		List<SuGoods> queryGoods = stockService.stock(goods);
		model.addAttribute("queryGoods", queryGoods);
		return "add/search";
	}
}
