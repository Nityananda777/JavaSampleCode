package com.core.ds.recursion;

public class StackOverflow {
	public static void recursive(int num) {
		System.out.println(num);
		recursive(num+1);
	}
	
	public static void main(String[] args) {
		recursive(1);
	}

}
