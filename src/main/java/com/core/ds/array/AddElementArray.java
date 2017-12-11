package com.core.ds.array;

public class AddElementArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a[] = { 10, 9, 3, 5, 2, 1, 7 };
		System.out.println(add(a, 7, 10));

	}

	public static int[] add(int[] a, int position, int x) {
		a[6] = x;
		return a;
	}
}
