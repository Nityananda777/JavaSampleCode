package com.core.string;

import java.util.Date;

public class TestMain {

	public static void main(String[] args) {
		String s = "Hello";
		StringBuffer rev = new StringBuffer();
		for (int i = s.length() - 1; i >= 0; i--) {
			rev.append(s.charAt(i));
		}
		System.out.println(rev);
	}
}