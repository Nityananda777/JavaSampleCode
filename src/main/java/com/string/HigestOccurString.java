package com.string;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class HigestOccurString {
	public static void main(String[] args) {
		Map<Character, Integer> m = new HashMap<Character, Integer>();
		String s = "ssssaaaaabbbbbbbcccccccccccc";
		int count = 0;
		char a[] = s.toCharArray();
		for (char c : a) {
			if (m.containsKey(c)) {
				m.put(c, m.get(c)+1);
			} else {
				m.put(c, 1);
			}
		}
		System.out.println(m);
	}
}
