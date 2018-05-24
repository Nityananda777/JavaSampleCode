package com.core.string;

public class CountCharacterOccurence {
	public static void main(String[] args) {
		
	int count=0;
	String ch="a";
	String s = "aaaIndia is great county in the world";
	count=s.length()-s.replace(ch, "").length();
	System.out.println("Total count of a character without loop is "+count);
	}
}
