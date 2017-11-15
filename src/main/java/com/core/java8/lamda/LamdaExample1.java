package com.core.java8.lamda;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class LamdaExample1 {
	public static void main(String[] args) {
		List<String> l = Arrays.asList("apple", "orange", "banana", "grape");
		// Collections.sort(l, (o1,o2) -> o1.compareTo(o2));
		// System.out.println(l);
		l.sort(Comparator.nullsLast(String::compareTo));
		System.out.println(l);
	}
}
