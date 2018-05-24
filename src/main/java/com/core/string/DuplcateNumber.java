package com.core.string;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

/*
 * Count duplicate number from string.
 */
public class DuplcateNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String ss = "javaj2ee";
		Map<Character, Integer> m = new HashMap<Character, Integer>();
		char a[] = ss.toCharArray();
		for (char aa : a) {
			if (m.containsKey(aa)) {
				m.put(aa, m.get(aa) + 1);
			} else {
				m.put(aa, 1);
			}
		}
		System.out.println("string is.." + ss);
		System.out.println("map is.." + m);
		Set<Character> c = m.keySet();
		for (Character cs : c) {
			if (m.get(cs) > 1) {
				System.out.println("character    " + cs + " " + m.get(cs));
			}
		}
	}

}
