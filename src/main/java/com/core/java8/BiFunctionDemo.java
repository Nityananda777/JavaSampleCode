package com.core.java8;

import java.util.function.BiFunction;

public class BiFunctionDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		BiFunction<Integer, Integer, Integer> bi = (s1, s2) -> (s1 + s2);
		System.out.println(bi.apply(10, 20));
		System.out.println(bi.apply(20, 10));
		System.out.println(bi.apply(30, 30));
	}

}
