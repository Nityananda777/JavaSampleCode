package com.core.ds.recursion.array;

public class MinimumElement {

	public static void main(String[] args) {
		int a[] = { 10, 9, 3, 5, 2, 1,0, 7 };
		int max =a[0];
		for (int i = 1; i < a.length-1; i++) {
			if (a[i+1] < max) {
				max = a[i+1];
			}
		}
		System.out.println("Smallest element is " + max);
	}

}
