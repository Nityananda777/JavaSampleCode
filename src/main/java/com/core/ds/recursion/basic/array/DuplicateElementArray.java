package com.core.ds.recursion.basic.array;

public class DuplicateElementArray {

	public static void main(String[] args) {
		int a[] = { 1, 9, 3, 5, 2, 1, 7 ,9};
		for (int i = 0; i < a.length; i++) {
			for (int j = i + 1; j < a.length; j++) {
				if (a[i] == a[j]) {
					System.out.println("duplicate element is " + a[i]);
				}
			}
		}
	}

}
