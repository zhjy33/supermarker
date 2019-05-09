package com.supermarket.demo.service.login.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.supermarket.demo.dao.admin.AdminMapper;
import com.supermarket.demo.model.admin.Admin;
import com.supermarket.demo.service.login.LoginService;

@Service
@Transactional(readOnly = false)
public class LoginServiceImpl implements LoginService {
	
	@Autowired
	private AdminMapper adminMapper;

	public Admin login(Admin admin) {
		return adminMapper.checkAdmin(admin);
	}

	
}
