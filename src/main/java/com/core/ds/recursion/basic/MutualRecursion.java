package com.core.ds.recursion.basic;

import java.util.Scanner;

public class MutualRecursion {
	
	public static boolean isOdd(int n) {
		if (n<0) throw new IllegalArgumentException("Can't accept negative arguments");
		return (n == 0) ? false : isEven(n-1);
	}
	
	public static boolean isEven(int n) {
		if (n<0) throw new IllegalArgumentException("Can't accept negative arguments");
		return (n == 0) ? true : isOdd(n-1);
	}
	
	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);
		System.out.print("Enter a number: ");
		int num = stdIn.nextInt();
		
		if (isEven(num)) System.out.println(num + " is even");
		else System.out.println(num + " is odd");
 		
		stdIn.close();
	}

}
