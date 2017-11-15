package com.core.java8;

import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class CollectorTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String result = "";
		Map<String, Integer> map = new HashMap<>();
		map.put("india", 10);
		map.put("us", 12);
		map.put("pak", 13);
		map.put("uk", 14);
		map.put("rusia", 15);

		List<String> list = Arrays.asList("hello", "india", "world", "india");
		list.stream().map(n -> n.toUpperCase()).collect(Collectors.toCollection(HashSet::new))
				.forEach(n -> System.out.println(n));

		// System.out.println("collectors collectingandthen");
		// result =list.stream().map(n ->
		// n.toUpperCase()).collect(Collectors.collectingAndThen(Collectors.toList(),ImmutableList::copyOf));
		// System.out.println(result);
		Map<String, Long> finalMap = new LinkedHashMap<>();
		System.out.println("groupby..");
		Map<String, Long> maps = list.stream()
				.collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));

		System.out.println("groupby with sorting ");
		maps.entrySet().stream().sorted(Map.Entry.<String, Long> comparingByValue().reversed())
				.forEachOrdered(e -> finalMap.put(e.getKey(), e.getValue()));
		System.out.println(finalMap);
		
		System.out.println("collectors joining..");
		result = list.stream().map(n -> n.toUpperCase()).collect(Collectors.joining());
		System.out.println(result);
		System.out.println("collectors joining with space");
		result = list.stream().map(n -> n.toUpperCase()).collect(Collectors.joining(" "));
		System.out.println(result);
		System.out.println("collectors joining with prefix and sufix");
		result = list.stream().map(n -> n.toUpperCase()).collect(Collectors.joining(",", "[", "]"));
		System.out.println(result);
	}

}
