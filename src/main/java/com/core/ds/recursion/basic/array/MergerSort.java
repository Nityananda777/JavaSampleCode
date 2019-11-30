package com.core.ds.recursion.basic.array;

public class MergerSort {
	int x[] = new int[11];

	public static void main(String[] args) {
		MergerSort m = new MergerSort();
		int a[] = { 10, 20, 9, 3, 4, 5, 11, 13, 8, 7, 6 };
		int l = 0;
		int h = a.length - 1;
		m.sort(a, l, h);
	}

	public void sort(int a[], int l, int h) {
		if (l == h) {
			return;
		} else if (l < h) {
			int m = (l + h) / 2;
			sort(a, l, m);
			sort(a, m + 1, h);
			merge(a, l, m + 1, h);
		}

	}

	public void merge(int a[], int l, int highptr, int h) {
		int j = 0;
		int low = l;
		int mid = highptr - 1;
		int n = a.length - 1;
		while (low <= mid && highptr <= h) {
			if (a[l] < a[h]) {
				x[j++] = a[l++];
			} else
				x[j++] = a[h++];

		}
		while (l <= mid) {
			x[j++] = a[l++];
		}
		while (highptr <= h) {
			x[j++] = a[h++];
		}
		for (j = 0; j < n; j++) {
			System.out.println(x[j]);
		}
	}

}
