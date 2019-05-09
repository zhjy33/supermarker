package com.supermarket.demo.service.salary.impl;

import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.supermarket.demo.dao.salary.SuSalaryMapper;
import com.supermarket.demo.model.admin.Admin;
import com.supermarket.demo.model.admin.UserHolder;
import com.supermarket.demo.model.salary.SuSalary;
import com.supermarket.demo.service.salary.SalaryService;
import com.supermarket.demo.util.NumberUtil;

@Service
@Transactional(readOnly = true)
public class SalaryServiceImpl implements SalaryService {
	
	@Autowired
	private SuSalaryMapper salaryMapper;
	
	@Override
	public List<SuSalary> querySalary() {
		// TODO Auto-generated method stub
		List<SuSalary> salary = salaryMapper.query();
		return salary;
	}

	@Override
	@Transactional(readOnly = false)
	public void saveSalary(SuSalary salary) {
		// TODO Auto-generated method stub
		Long id = NumberUtil.generate10Long();
		Date date = new Date(System.currentTimeMillis());
		Admin user = UserHolder.getUser();
		
		salary.setId(id);
		salary.setCreateDate(date);
		salary.setCreateBy(user.getId());
		salary.setIsDelete(false);
		salaryMapper.insertSelective(salary);
	}

	@Override
	@Transactional(readOnly = false)
	public void deleteSalary(Long id) {
		// TODO Auto-generated method stub
		salaryMapper.delete(id);
	}

}
