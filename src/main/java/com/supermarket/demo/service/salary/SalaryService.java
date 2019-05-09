package com.supermarket.demo.service.salary;

import java.util.List;

import com.supermarket.demo.model.salary.SuSalary;

public interface SalaryService {

	List<SuSalary> querySalary();

	void saveSalary(SuSalary goods);

	void deleteSalary(Long id);

}
