package com.core.string;

import java.util.LinkedHashSet;
import java.util.Set;
/*
 * Remove Duplicate Number from String
 */
public class RemoveDuplicateString {

	public static void main(String[] args) {
		String s = "aabbaacc";
		char a[] = s.toCharArray();
		Set<Character> set = new LinkedHashSet<Character>();
		for (char cc : a) {
			set.add(cc);
		}
		StringBuilder sb = new StringBuilder();
		for (Character c : set) {
			sb.append(c);
		}
		System.out.println(sb.toString());
	}

}
