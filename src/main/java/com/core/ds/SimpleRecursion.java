package com.core.ds;

public class SimpleRecursion {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// print(10);
		// System.out.println(fact(5));

		System.out.println(fact1(5, 1));
	}

	public static void print(int c) {
		if (c < 0) {
			return;
		} else {
			System.out.println("Hello world");
			print(c - 1);
		}
	}

	public static int fact(int n) {
		int f = 0;
		if (n == 0) {
			return 1;
		} else {
			f = n * fact(n - 1);
		}
		return f;
	}

	public static int fact1(int n, int result) {
		int f = 0;
		if (n == 0) {
			return result;
		} else {
			f = fact1(n - 1, n * result);
		}
		return f;
	}
}
