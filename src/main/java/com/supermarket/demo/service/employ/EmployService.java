package com.supermarket.demo.service.employ;

import java.util.List;

import com.supermarket.demo.model.employ.SuEmployer;

public interface EmployService {

	List<SuEmployer> queryEmploy();

	void saveEmployer(SuEmployer employ);

	void deleteEmploy(Long id);

}
