package com.string;

public class StringUpperCase {
	public static void main(String[] args) {
		String name = "nityananda sahu";
		String a1[] = name.split(" ");
		System.out.println(a1[0]);
		System.out.println(a1[1]);
		for (String s : a1) {
			System.out.println(s.toUpperCase().charAt(0)+s.substring(1)+" ");
		}
	}
}
