package com.core.java8;

import java.util.Arrays;
import java.util.List;
import java.util.function.BinaryOperator;

class MyBinaryOperator implements BinaryOperator<Integer> {

	@Override
	public Integer apply(Integer t, Integer u) {
		// TODO Auto-generated method stub
		return t + u;
	}
}

public class ReducerTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MyBinaryOperator b = new MyBinaryOperator();
		List<Integer> list = Arrays.asList(10, 20, 30, 40, 50);
		list.stream().reduce(b).ifPresent(s -> System.out.println(s));

	}

}
