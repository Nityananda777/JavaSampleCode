package com.core.java8;

import java.util.HashMap;
import java.util.Map;
import java.util.function.BiConsumer;

public class BiConsumerDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Map<String, Integer> map = new HashMap<>();
		map.put("X", 12);
		map.put("Y", 13);
		map.put("Z", 14);
		map.put("U", 15);
		BiConsumer<String, Integer> b = (s1, s2) -> System.out.println("key " + s1 + "value " + s2);
		map.forEach(b);
	}

}
