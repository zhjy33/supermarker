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
import com.supermarket.demo.model.supplier.SuSupplier;
import com.supermarket.demo.service.good.GoodService;
import com.supermarket.demo.service.supplier.SupplierService;

@Controller
@RequestMapping("/supplier")
public class SupplierController {

	@Autowired
	private SupplierService supplierService;
	
	@RequestMapping("/list")
	public String list(ModelMap model) {
		List<SuSupplier> supplier = supplierService.querySupplier();
		model.addAttribute("supplierList", supplier);
		return "list/supplier";
	}
	
	@RequestMapping(method = RequestMethod.GET,value = "/add")
	public String toAdd(ModelMap model) {
		return "add/supplier";
	}
	
	@RequestMapping(method = RequestMethod.POST,value = "/create")
	public String create(SuSupplier supplier) {
		supplierService.saveSupplier(supplier);
		return "redirect:/supplier/list";
	}
	
	@RequestMapping(method = RequestMethod.GET,value = "/delete/{id}")
	public String delete(@PathVariable("id")Long id) {
		supplierService.deleteSupplier(id);
		return "redirect:/supplier/list";
	}
}
