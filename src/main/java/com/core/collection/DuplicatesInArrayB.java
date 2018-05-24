package com.core.collection;

public class DuplicatesInArrayB {
	public static void main(String[] args) {
		int a[] = { 20, 20, 40, 50, 30, 40, 10,50 };
		for (int i = 0; i < a.length; i++) {
			for (int j = i + 1; j < a.length; j++) {
				if (a[i] == a[j]) {
					System.out.println("duplicate is   " + a[i]);
				}
			}
		}
	}
}
