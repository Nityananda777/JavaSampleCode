package com.core.ds.array;

public class LargestElement {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a[] = { 10, 9, 3, 5, 2, 1, 7 };
		int max = 0;
		for (int i = 0; i < a.length; i++) {
			max=Math.max(max,a[i]);
		}
		System.out.print(max);
	}

}
