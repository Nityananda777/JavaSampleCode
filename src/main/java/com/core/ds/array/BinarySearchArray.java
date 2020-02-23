package com.core.ds.array;

public class BinarySearchArray {

	public static void main(String[] args) {

		int a[] = { 10, 20, 30, 9, 0, 1, 2 };
		int left = 0;
		int right = a.length-1;
		System.out.println(binarySearch(a, left, right, a[3]));
	}

	public static int binarySearch(int a[], int left, int right, int x) {
		int mid = left + right  / 2;
		if (a[mid] == x) {
			return a[mid];
		} else if (left < mid) {
			return binarySearch(a, left, mid, x);
		} else {
			return binarySearch(a, mid, right, x);
		}
	}
	
	

}
