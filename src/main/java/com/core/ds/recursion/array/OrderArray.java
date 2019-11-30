package com.core.ds.recursion.array;

public class OrderArray {
	static int a[] = { 1, 2, 4, 6, 7, 8, 9 };

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(find(0, 6, 2));
	}

	public static int find(int l, int h, int key) {
		int m = 0;
		m = (l + h) / 2;
		if (a[m] == key) {
			System.out.println("found " + a[m]);
			return m;
		} else if (a[l] > a[h]) {
			return a.length;
		} else {
			if (key < a[m]) {
				return find(l, m, key);
			} else {
				return find(m + 1, h, key);
			}

		}

	}
	// public static int find(int a[], int key) {
	// int m ;
	// int l = 0;
	// int h = 6;
	// while (true) {
	// m = (l + h) / 2;
	// if (a[m] == key) {
	// System.out.println("found " + a[m]);
	// return a[m];
	// } else if (a[l] > a[h]) {
	// return a.length;
	// } else {
	// if (key > a[m]) {
	// l = m + 1;
	// } else {
	// h = m - 1;
	// }
	//
	// }
	//
	// }
	//
	// }

}
