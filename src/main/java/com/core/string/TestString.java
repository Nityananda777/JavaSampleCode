package com.core.string;

/*
 * 
 * 
 */
public class TestString {

	public static void main(String[] args) {
		String s = "abcd";
		char ss[] = s.toCharArray();
		for (int i = ss.length - 1; i >= 0; i--) {
			System.out.println(ss[i]);
		}
		
		StringBuilder sb = new StringBuilder();
		for (int i = s.length()-1; i >= 0; i--) {
		sb.append(s.charAt(i));	
		}
		System.out.println(sb.toString());

	}
}
