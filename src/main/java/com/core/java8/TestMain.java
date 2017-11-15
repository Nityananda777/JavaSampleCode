package com.core.java8;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;

@FunctionalInterface
interface Iface {
	void mm(Integer i);

	default void mm(String i) {
		System.out.println("hello world");
	}

	default void yy() {
		System.out.println("hello india ");
	}

	static void display() {
		System.out.println("inside static method");
	}
}

class MyPredicate implements Predicate<Integer> {
	@Override
	public boolean test(Integer t) {
		// TODO Auto-generated method stub
		if (t.equals(110)) {
			return true;
		}
		return false;
	}

}

class MyFunction implements Function<String, Integer> {

	@Override
	public Integer apply(String t) {
		// TODO Auto-generated method stub
		return Integer.parseInt(t);
	}
}

class MyConsumer implements Consumer<Integer> {

	@Override
	public void accept(Integer t) {
		// TODO Auto-generated method stub
		System.out.println(t);
	}
}

public class TestMain {

	public static void main(String[] args) {
		Consumer c = new Consumer() {
			@Override
			public void accept(Object t) {
				// TODO Auto-generated method stub
				System.out.println(t);
			}
		};
		// TODO Auto-generated method stub
		MyPredicate p = new MyPredicate();
		MyFunction m = new MyFunction();
		MyConsumer co = new MyConsumer();
		List<String> list = new ArrayList<>();
		list.add("30");
		list.add("40");
		list.add("10");
		list.add("50");
		list.add("5");
		list.add("7");
		list.add("7");
		Comparator<Integer> cc = new Comparator<Integer>() {
			@Override
			public int compare(Integer o1, Integer o2) {
				// TODO Auto-generated method stub
				return o2.compareTo(o1);
			}
		};
		list.stream().map(m).distinct().forEach(co);
	}

}
