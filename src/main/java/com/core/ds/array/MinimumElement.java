package com.core.ds.array;

import java.util.ArrayList;
import java.util.List;

public class MinimumElement {

	public static void main(String[] args) {
		int a[] = { 10, 9, 3, 5, 2, 1,-1, 7 };

		int min =a[0];
		for (int i = 1; i < a.length-1; i++) {
			min=Math.min(min,a[i]);
		}
		System.out.println("Smallest element is " + min);
		List<Integer> l=new ArrayList<>();
		l.stream().mapToInt(p->p.intValue()).toArray();
	}

}
