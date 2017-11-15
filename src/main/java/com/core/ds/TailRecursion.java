package com.core.ds;

import java.util.Scanner;

public class TailRecursion {

	public static int tailFactorial(int n, Object... previous) {
		if (n<0) throw new IllegalArgumentException("Can't calculate factorial of negative");
		int prev = (previous.length > 0) ? (int) previous[0] : 1;
		
		return (n < 2) ? prev : tailFactorial(n-1,n*prev);
	}
	
	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);
		System.out.print("Factorial of what number do you want to calculate? ");
		int num = stdIn.nextInt();
		System.out.printf("%d! = %d", num, tailFactorial(num));
		
		stdIn.close();
	}
}
