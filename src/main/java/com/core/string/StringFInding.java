package com.core.string;

public class StringFInding {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String ms = "welcome to java";
		String sb1 = "java";
		String sb2 = "oracle";
		int i = ms.indexOf(sb1);
		System.out.println(i);
		if (i != -1) {
			System.out.println("sb1 is present in ");
		}
		else{
			System.out.println("not present");
		}
	}

}
