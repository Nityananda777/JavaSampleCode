package com.core.java8;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.function.BiConsumer;
import java.util.function.BinaryOperator;

public class BinaryOperatorDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Map<String, String> map = new HashMap<>();
		map.put("X", "10");
		map.put("Y", "20");
		map.put("Z", "30");
		System.out.println(getMap(map, (s1, s2) -> s1 + s2));
	}

	public static List<String> getMap(Map<String, String> m, BinaryOperator<String> b) {
		List<String> l = new ArrayList<>();
		BiConsumer<String, String> bs = (s1, s2) -> l.add(b.apply(s1, s2));
		m.forEach(bs);
		return l;

	}
}
