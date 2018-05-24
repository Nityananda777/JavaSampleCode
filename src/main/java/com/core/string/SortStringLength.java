package com.core.string;

import java.util.Arrays;
import java.util.Comparator;

public class SortStringLength {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String[] str = { "umbrella", "apple", "baby", "cat", "rat", "obnoxious" };
		Arrays.sort(str, new Comparator<String>() {

			public int compare(String o1, String o2) {
				return o1.length() - o2.length();
			}
		});

		for (String s : str) {
		System.out.println(s);
		}
	}
}
