package com.string;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class MaxMinArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a[] = { 10, 20, 2, 30, 4, 68 };
		List<Integer> l= new ArrayList<>();
		for (int i = 0; i < a.length; i++) {
		l.add(i);	
		}
		System.out.println(getMax(a));
	}

	private static int getMax(int a[]) {
		int maxVal = a[0];
		for (int i = 0; i < a.length; i++) {
			if (a[i] > maxVal) {
				maxVal = a[i];
			}
		}
		return maxVal;
	}

}
