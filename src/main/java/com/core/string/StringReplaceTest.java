package com.core.string;

public class StringReplaceTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s = "County India is a good Country";
	//	System.out.println(s.replaceFirst("County", "City"));
		System.out.println(s.replaceAll("Cou(.*)", "City"));
	}

}
