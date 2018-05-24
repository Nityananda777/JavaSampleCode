package com.core.collection;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Date;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class HashMapLIst {

	public static void main(String[] args) {

		Date d1 = new Date(2015 - 1900, 01, 01);
		Date d2 = new Date(2013 - 1900, 01, 01);
		Date d3 = new Date(2013 - 1900, 01, 02);
		Date d4 = new Date(2012 - 1900, 10, 01);
		Date d5 = new Date(2012 - 1900, 11, 01);

		Map<String, Fruit> m = new HashMap<String, Fruit>();
		m.put("india", new Fruit("Pineapple", "Pineapple description", 100, d1));
		m.put("USA", new Fruit("Apple", "Apple description", 200, d2));
		m.put("Sri Lanka", new Fruit("Banana", "Banana description", 400, d3));
		m.put("PAK", new Fruit("Grape", "Grape description", 90, d4));
		m.put("Bangladesh", new Fruit("Pome", "Pome description", 91, d5));
		Set<Map.Entry<String, Fruit>> s = m.entrySet();
		List<Map.Entry<String, Fruit>> list = new ArrayList<Map.Entry<String, Fruit>>(s);

		Collections.sort(list, new Comparator<Map.Entry<String, Fruit>>() {
			public int compare(Map.Entry<String, Fruit> o1, Map.Entry<String, Fruit> o2) {
				//return (o2.getValue()).compareTo(o1.getValue());
				return o2.getValue().getDate().compareTo(o2.getValue().getDate());
			}
		});
		for (Map.Entry<String, Fruit> entry : list) {
			System.out.println(entry.getKey() + " ==== " + entry.getValue().toString());
		}


	}
}