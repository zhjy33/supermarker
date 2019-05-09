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
import com.supermarket.demo.service.good.GoodService;

@Controller
@RequestMapping("/goods")
public class GoodsController {

	@Autowired
	private GoodService goodService;
	
	@RequestMapping("/list")
	public String list(ModelMap model) {
		List<SuGoods> goods = goodService.queryGoods();
		model.addAttribute("goodsList", goods);
		return "list/goods";
	}
	
	@RequestMapping(method = RequestMethod.GET,value = "/add")
	public String toAdd(ModelMap model) {
		List<SuKind> queryKind = goodService.queryKind();
		model.addAttribute("kindsList", queryKind);
		return "add/goods";
	}
	
	@RequestMapping(method = RequestMethod.POST,value = "/create")
	public String create(SuGoods goods) {
		goodService.saveGoods(goods);
		return "redirect:/goods/list";
	}
	
	@RequestMapping(method = RequestMethod.GET,value = "/delete/{id}")
	public String delete(@PathVariable("id")Long id) {
		goodService.deleteGoods(id);
		return "redirect:/goods/list";
	}
}
