package com.atomic;

public class TestSection {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int a[] = { 10, 9, 3, 11, 2, 4 };
		int aa[] = sort(a);
		for (int i : aa) {
			System.out.print(i);
			System.out.print(", ");
		}
	}

	private static int[] sort(int a[]) {
		for (int i = 0; i < a.length; i++) {
			int min = i;
			for (int j = i + 1; j < a.length; j++) {
				if (a[j] < a[min]) {
					int temp = a[j];
					a[j] = a[min];
					a[min] = temp;
				}
			}
		}
		return a;
	}

}
