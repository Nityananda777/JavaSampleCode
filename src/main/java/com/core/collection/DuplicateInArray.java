package com.core.collection;

import java.util.HashSet;
import java.util.Set;

public class DuplicateInArray {

	public static void main(String[] args) {
		int a[] = { 10, 20, 30, 50, 30, 40, 10 };
		Set<Integer> s = new HashSet<>();
		for (int i = 0; i < a.length; i++) {
		if(s.add(a[i])==false)
		{
		System.out.println("duplicate is   "+a[i]);	
		}
		}
	}
}
