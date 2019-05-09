package com.supermarket.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.supermarket.demo.model.employ.SuEmployer;
import com.supermarket.demo.model.good.SuGoods;
import com.supermarket.demo.model.good.SuKind;
import com.supermarket.demo.service.employ.EmployService;
import com.supermarket.demo.service.good.GoodService;

@Controller
@RequestMapping("/employ")
public class EmployController {

	@Autowired
	private EmployService employService;
	
	@RequestMapping("/list")
	public String list(ModelMap model) {
		List<SuEmployer> employ = employService.queryEmploy();
		model.addAttribute("employList", employ);
		return "list/employ";
	}
	
	@RequestMapping(method = RequestMethod.GET,value = "/add")
	public String toAdd(ModelMap model) {
		return "add/employ";
	}
	
	@RequestMapping(method = RequestMethod.POST,value = "/create")
	public String create(SuEmployer employ) {
		employService.saveEmployer(employ);
		return "redirect:/employ/list";
	}
	
	@RequestMapping(method = RequestMethod.GET,value = "/delete/{id}")
	public String delete(@PathVariable("id")Long id) {
		employService.deleteEmploy(id);
		return "redirect:/employ/list";
	}
}
