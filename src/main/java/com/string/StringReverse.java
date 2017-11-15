package com.string;

public class StringReverse {

	public static void main(String[] args) {
		String name = "Hello";
		char[] ch = name.toCharArray();
		for (int i = ch.length - 1; i >= 0; i--) {
			System.out.print(ch[i]);
		}
	}

}
