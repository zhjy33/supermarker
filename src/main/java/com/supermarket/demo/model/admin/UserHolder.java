package com.supermarket.demo.model.admin;

public class UserHolder {

	private static ThreadLocal<Admin> currentUser = new ThreadLocal<>();
	
	public static void setUser(Admin admin) {
		currentUser.set(admin);
	}
	
	public static Admin getUser() {
		return currentUser.get();
	}
	
	public static void clear() {
		currentUser.remove();
	}
}
