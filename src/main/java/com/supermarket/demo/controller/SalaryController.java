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
import com.supermarket.demo.model.salary.SuSalary;
import com.supermarket.demo.service.employ.EmployService;
import com.supermarket.demo.service.good.GoodService;
import com.supermarket.demo.service.salary.SalaryService;

@Controller
@RequestMapping("/salary")
public class SalaryController {

	@Autowired
	private EmployService employService;
	
	@Autowired
	private SalaryService salaryService;
	
	@RequestMapping("/list")
	public String list(ModelMap model) {
		List<SuSalary> salaries = salaryService.querySalary();
		model.addAttribute("salariesList", salaries);
		return "list/salary";
	}
	
	@RequestMapping(method = RequestMethod.GET,value = "/add")
	public String toAdd(ModelMap model) {
		List<SuEmployer> employ = employService.queryEmploy();
		model.addAttribute("employ", employ);
		return "add/salary";
	}
	
	@RequestMapping(method = RequestMethod.POST,value = "/create")
	public String create(SuSalary goods) {
		salaryService.saveSalary(goods);
		return "redirect:/salary/list";
	}
	
	@RequestMapping(method = RequestMethod.GET,value = "/delete/{id}")
	public String delete(@PathVariable("id")Long id) {
		salaryService.deleteSalary(id);
		return "redirect:/salary/list";
	}
}
