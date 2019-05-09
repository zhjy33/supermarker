package com.supermarket.demo.config;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Component;
import org.springframework.web.servlet.HandlerInterceptor;
import org.springframework.web.servlet.ModelAndView;

import com.supermarket.demo.model.admin.Admin;
import com.supermarket.demo.model.admin.UserHolder;
import com.supermarket.demo.util.Contants;
@Component
public class LoginInterceptor implements HandlerInterceptor{
	

	public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler)
			throws Exception {
		HttpSession session = request.getSession();
		Object user = session.getAttribute(Contants.SESSION_LOGIN);
		if(user == null) {
			response.sendRedirect("/tologin");
			return false;
		}
		UserHolder.setUser((Admin)user);
		return true;
	}

	public void postHandle(HttpServletRequest request, HttpServletResponse response, Object handler,
			ModelAndView modelAndView) throws Exception {
		
	}

	public void afterCompletion(HttpServletRequest request, HttpServletResponse response, Object handler, Exception ex)
			throws Exception {
		
	}

}
