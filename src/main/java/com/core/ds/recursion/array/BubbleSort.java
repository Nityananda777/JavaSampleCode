package com.core.ds.recursion.array;

public class BubbleSort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[] = { 10, 5, 4, 11, 9, 3, 12 };
		sort(arr, arr.length);
		printArray(arr);
	}

	public static void sort(int a[], int n) {

		for (int i = 0; i < n - 1; i++) {
			for (int j = 0; j < (n - i)-1; j++) {
				if (a[j] > a[j + 1]) {
					int temp = a[j];
					a[j] = a[j + 1];
					a[j + 1] = temp;
				}
			}
		}
	}

	public static void printArray(int a[]) {
		for (int k = 0; k < a.length; k++) {
			System.out.println(a[k]);
		}
	}
}
