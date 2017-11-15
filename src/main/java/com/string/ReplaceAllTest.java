package com.string;

public class ReplaceAllTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s = "Hello india world ";
		/*
		 * s = s.replaceAll("\\s", ""); System.out.println(s);
		 */
		
		char a[] = s.toCharArray();
		StringBuilder sb = new StringBuilder();
		for (int i = 0; i < s.length()-1; i++) {
			if ((a[i] != ' ') && (a[i] != '\t')) {
				sb.append(a[i]);
			}
		}
		System.out.println(sb.toString());
		
		
		

	}
}
