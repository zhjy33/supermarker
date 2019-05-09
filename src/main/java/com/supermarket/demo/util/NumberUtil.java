package com.supermarket.demo.util;

import java.util.Random;

public class NumberUtil {

	static Random r = new Random();
	
	public static Long generate10Long() {
		StringBuilder sb = new StringBuilder();
		
		for(int i = 0 ; i < 17;i++) {
			sb.append(r.nextInt(10));
		}
		return Long.parseLong(sb.toString());
	}
}
