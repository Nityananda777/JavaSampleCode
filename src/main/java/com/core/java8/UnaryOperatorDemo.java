package com.core.java8;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.UnaryOperator;

public class UnaryOperatorDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Integer> list = Arrays.asList(10, 20, 30, 40, 50);
		System.out.println(getDouble(list, i -> i * i));
	}

	public static List<Integer> getDouble(List<Integer> list, UnaryOperator<Integer> u) {
		List<Integer> l = new ArrayList<>();
		list.forEach(i -> l.add(u.apply(i)));
		return l;

	}
}
