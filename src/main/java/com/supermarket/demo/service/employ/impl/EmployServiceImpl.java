package com.supermarket.demo.service.employ.impl;

import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.util.StringUtils;

import com.supermarket.demo.dao.employ.SuEmployerMapper;
import com.supermarket.demo.model.admin.Admin;
import com.supermarket.demo.model.admin.UserHolder;
import com.supermarket.demo.model.employ.SuEmployer;
import com.supermarket.demo.service.employ.EmployService;
import com.supermarket.demo.util.NumberUtil;

@Service
@Transactional(readOnly = true)
public class EmployServiceImpl implements EmployService {
	
	@Autowired
	private SuEmployerMapper employMapper;

	@Override
	public List<SuEmployer> queryEmploy() {
		List<SuEmployer> employ = employMapper.queryEmploy();
		return employ;
	}

	@Override
	@Transactional(readOnly = false)
	public void saveEmployer(SuEmployer employ) {
		// TODO Auto-generated method stub
		Admin user = UserHolder.getUser();
		Date date = new Date(System.currentTimeMillis());
		Long id = NumberUtil.generate10Long();
		
		employ.setId(id);
		employ.setCreateBy(user.getId());
		employ.setCreateDate(date);
		employ.setIsDelete(false);
		employMapper.insertSelective(employ);
	}

	@Override
	@Transactional(readOnly = false)
	public void deleteEmploy(Long id) {
		// TODO Auto-generated method stub
		employMapper.delete(id);
	}

}
