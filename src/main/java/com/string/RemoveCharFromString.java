package com.string;

public class RemoveCharFromString {
	public static void main(String[] args) {
		String s = "java world";
		char c = ' ';
		char[] a = s.toCharArray();
		StringBuffer sb = new StringBuffer();
		for (char ch : a) {
			if (ch != c) {
				sb.append(ch);
			}

		}
		System.out.println(sb.toString());

	}
}
