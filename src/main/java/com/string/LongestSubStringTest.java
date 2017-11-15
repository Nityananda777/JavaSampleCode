package com.string;

import java.util.HashMap;
import java.util.Map;

public class LongestSubStringTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s = "javaconceptoftheday";
		int longestStringLen = 0;
		String subString = "";
		char arr[] = s.toCharArray();
		Map<Character, Integer> m = new HashMap<Character, Integer>();
		for (int i = 0; i < arr.length; i++) {
			char ch=arr[i];
			if (m.containsKey(arr[i])) {
				i= m.get(ch);
				m.clear();
			} else {
				m.put(ch, i);
				
			}
			if (m.size() > longestStringLen) {
				subString = m.entrySet().toString();
				longestStringLen++;
			}
		}
		System.out.println("longest substring is .." + subString);
		System.out.println("longest substring length  is .." + longestStringLen);

	}

}
