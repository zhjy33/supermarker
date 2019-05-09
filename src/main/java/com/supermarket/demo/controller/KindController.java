package com.supermarket.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpMethod;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.supermarket.demo.model.good.SuKind;
import com.supermarket.demo.service.good.GoodService;

@Controller
@RequestMapping("/kind")
public class KindController {

	@Autowired
	private GoodService goodService;
	
	@RequestMapping(method = RequestMethod.GET,value = "/list")
	public String login(ModelMap model) {
		List<SuKind> kinds = goodService.queryKind();
		model.addAttribute("kindLists", kinds);
		return "list/kind";
	}
	
	@RequestMapping(method = RequestMethod.GET,value = "/add")
	public String toAdd() {
		return "add/kind";
	}
	
	@RequestMapping(method = RequestMethod.POST,value = "/create")
	public String create(SuKind kind) {
		goodService.saveKind(kind);
		return "redirect:/kind/list";
	}
	
	@RequestMapping(method = RequestMethod.GET,value = "/delete/{id}")
	public String delete(@PathVariable("id")Long id) {
		goodService.delete(id);
		return "redirect:/kind/list";
	}
	
	@RequestMapping(method = RequestMethod.GET,value ="/forgoods")
	public List<SuKind> listKindForGoods() {
		List<SuKind> queryKind = goodService.queryKind();
		return queryKind;
	}
}
