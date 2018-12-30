package com.core.ds;

public class InsertionSort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[] = { 10, 5, 4, 11, 9, 3, 12 };
		sort(arr, arr.length);
		printArray(arr);
	}

	public static void sort(int a[], int n) {

		for (int i = 1; i < n; i++) {
			int key = a[i];
			int j = i - 1;
			while (j >= 0 && a[j] > key) {
				a[j + 1] = a[j];
				j--;
			}
			a[j + 1] = key;
		}
	}

	public static void printArray(int a[]) {
		for (int k = 0; k < a.length; k++) {
			System.out.println(a[k]);
		}
	}
}
