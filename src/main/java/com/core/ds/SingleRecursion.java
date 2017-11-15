package com.core.ds;

import java.util.Scanner;

public class SingleRecursion {

	public static long factorial(int n) {
		if (n<0) throw new IllegalArgumentException("Can't calculate factorial of negative");
		return (n<2) ? 1 : n*factorial(n-1);
	}
	
	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);
		System.out.print("Factorial of what number do you want to calculate? ");
		int num = stdIn.nextInt();
		System.out.printf("%d! = %d", num, factorial(num));
		
		stdIn.close();
	}
	
}
