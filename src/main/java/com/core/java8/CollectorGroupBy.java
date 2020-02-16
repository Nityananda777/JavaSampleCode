package com.core.java8;

import java.math.BigDecimal;
import java.util.Arrays;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

class Item {
	private String name;
	private int qty;
	private BigDecimal price;

	public Item(String name, int qty, BigDecimal price) {
		super();
		this.name = name;
		this.qty = qty;
		this.price = price;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getQty() {
		return qty;
	}

	public void setQty(int qty) {
		this.qty = qty;
	}

	public BigDecimal getPrice() {
		return price;
	}

	public void setPrice(BigDecimal price) {
		this.price = price;
	}

}

public class CollectorGroupBy {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Item> items = Arrays.asList(new Item("apple", 10, new BigDecimal("9.99")),
				new Item("banana", 20, new BigDecimal("19.99")), new Item("orang", 10, new BigDecimal("29.99")),
				new Item("watermelon", 10, new BigDecimal("29.99")), new Item("papaya", 20, new BigDecimal("9.99")),
				new Item("apple", 10, new BigDecimal("9.99")), new Item("banana", 10, new BigDecimal("19.99")),
				new Item("apple", 20, new BigDecimal("9.99")));

		Map<String, Long> maps = items.stream().collect(Collectors.groupingBy(Item::getName, Collectors.counting()));
		System.out.println(maps);

		Map<String, Long> finalMap = new LinkedHashMap<>();
		maps.entrySet().stream().sorted(Map.Entry.comparingByValue()).forEachOrdered(e->finalMap.put(e.getKey(),e.getValue()));
		System.out.println(finalMap);

		Map<String, Integer> sums = items.stream()
				.collect(Collectors.groupingBy(Item::getName, Collectors.summingInt(Item::getQty)));
		//System.out.println(sums);

		Map<BigDecimal, List<Item>> ss = items.stream().collect(Collectors.groupingBy(Item::getPrice));
		//System.out.println(ss);
	}

}
