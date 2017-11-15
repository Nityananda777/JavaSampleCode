package com.core.java8;

import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;

public class PredicateTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Integer> l = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);
		test(l, n -> true);
		System.out.println("print even no...");
		test(l, n -> n % 2 == 0);
		System.out.println("print no greater than 3");
		test(l, n -> n > 3);
	}

	private static void test(List<Integer> list, Predicate<Integer> p) {
		for (Integer n : list) {
			if (p.test(n)) {
				System.out.println(n);
			}
		}
	}

}
