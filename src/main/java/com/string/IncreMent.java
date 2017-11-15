package com.string;

import java.util.HashMap;
import java.util.Map;

/*
 * Find Occurrences Of Each Character In String.
 * 
 */
public class IncreMent {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		incrementCount("javaqqqqqqqqqqqqqqqqqqqbbbbbbbbbbbbbbbbbaqqqqqqqqq");
	}

	private static void incrementCount(String s) {

		Map<Character, Integer> m = new HashMap<Character, Integer>();
		char c[] = s.toCharArray();
		for (char cc : c) {
			if (m.containsKey(cc)) {
				m.put(cc, m.get(cc) + 1);
			} else {
				m.put(cc, 1);
			}
		}
		System.out.println(m);
		for (int i = 0; i < s.length(); i++) {
			char cc = s.charAt(i);
			if (m.get(cc) == 1) {
				System.out.println("non repetive words are" + cc);
			}
		}
	}
}
