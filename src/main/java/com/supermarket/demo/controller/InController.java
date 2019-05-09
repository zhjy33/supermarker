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
@RequestMapping("/in")
public class InController {

	@Autowired
	private  StockService stockService;
	
	@Autowired
	private GoodService goodService;
	
	@RequestMapping("/list")
	public String list(ModelMap model) {
		List<SuStock> stock = stockService.queryStock();
		model.addAttribute("stockList", stock);
		return "list/stock";
	}
	
	@RequestMapping(method = RequestMethod.GET,value = "/add")
	public String toAdd(ModelMap model) {
		List<SuGoods> queryGoods = goodService.queryGoods();
		model.addAttribute("goodsList", queryGoods);
		return "add/stock";
	}
	
	@RequestMapping(method = RequestMethod.POST,value = "/create")
	public String create(SuStock stock) {
		stockService.saveStock(stock);
		return "redirect:/in/list";
	}
	
	@RequestMapping(method = RequestMethod.GET,value = "/delete/{id}")
	public String delete(@PathVariable("id")Long id) {
		stockService.deleteStock(id);
		return "redirect:/in/list";
	}
}
