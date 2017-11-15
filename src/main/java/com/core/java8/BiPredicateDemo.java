package com.core.java8;

import java.util.function.BiPredicate;

public class BiPredicateDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		BiPredicate<String, Integer> bi = (s1, s2) -> s1.startsWith("R") && s2 > 10;
		System.out.println(bi.test("raja", 20));
		System.out.println(bi.test("Ramesh", 30));
		System.out.println(bi.test("UU", 40));
	}

}
