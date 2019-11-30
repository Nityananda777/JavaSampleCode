package com.core.ds.recursion.basic;

import java.util.Scanner;

public class MultipleRecursion {

	public static long fibonacci(long n) {
		if (n<0) throw new IllegalArgumentException("Can't accept negative arguments");
		return (n < 2) ? n : fibonacci(n-1) + fibonacci(n-2);
	}
	
	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);
		
		System.out.print("How many numbers do you want to print? ");
		int iter = stdIn.nextInt();
		for (int i=0;i<iter;i++) {
			System.out.print(fibonacci(i) + " ");
		}
		
		stdIn.close();

	}

}
