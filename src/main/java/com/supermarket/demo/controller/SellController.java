package com.supermarket.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.supermarket.demo.model.good.SuGoods;
import com.supermarket.demo.model.good.SuSell;
import com.supermarket.demo.model.good.SuStock;
import com.supermarket.demo.service.good.GoodService;
import com.supermarket.demo.service.good.SellService;

@Controller
@RequestMapping("/sell")
public class SellController {

	@Autowired
	private SellService sellService;
	
	@Autowired
	private GoodService goodService;
	
	@RequestMapping("/list")
	public String list(ModelMap model) {
		List<SuSell> stock = sellService.querySell();
		model.addAttribute("sellList", stock);
		return "list/sell";
	}
	
	@RequestMapping(method = RequestMethod.GET,value = "/add")
	public String toAdd(ModelMap model) {
		List<SuGoods> queryGoods = goodService.queryGoods();
		model.addAttribute("goodsList", queryGoods);
		return "add/sell";
	}
	
	@RequestMapping(method = RequestMethod.POST,value = "/create")
	public String create(SuSell stock) {
		sellService.saveSell(stock);
		return "redirect:/sell/list";
	}
	
	@RequestMapping(method = RequestMethod.GET,value = "/delete/{id}")
	public String delete(@PathVariable("id")Long id) {
		sellService.deleteSell(id);
		return "redirect:/sell/list";
	}
}
