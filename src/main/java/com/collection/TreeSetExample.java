package com.collection;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.Date;
import java.util.List;

public class TreeSetExample {

	public static void main(String[] args) {
		Date d1 = new Date(2015 - 1900, 01, 01);
		Date d2 = new Date(2013 - 1900, 01, 01);
		Date d3 = new Date(2013 - 1900, 01, 02);
		Date d4 = new Date(2012 - 1900, 10, 01);
		Date d5 = new Date(2012 - 1900, 11, 01);

		Fruit f[] = new Fruit[] { new Fruit("Pineapple", "Pineapple description", 70, d1),
				new Fruit("Apple", "Apple description", 100, d2), new Fruit("Orange", "Orange description", 180, d3),
				new Fruit("Banana", "Banana description", 90, d4), new Fruit("Grape", "Grape description", 101, d4),
				new Fruit("Pomenogranate", "Pomenogranate description", 104, d5) };

		List<Fruit> fs = Arrays.asList(f);
		Collections.sort(fs, FruitNameComparators);
		Collections.reverse(fs);
		// Arrays.sort(f,FruitNameComparators);
		int i = 0;
		for (Fruit temp : f) {
			System.out.println("fruits " + ++i + " : " + temp.getFruitName() + ", Quantity : " + temp.getQuantity()
					+ ",Date :" + temp.getDate());
		}

	}

	public static final Comparator<Fruit> FruitNameComparators = new Comparator<Fruit>() {
		public int compare(Fruit o1, Fruit o2) {

			/*String fname1 = o1.getFruitName().toUpperCase();
			String fname2 = o2.getFruitName().toUpperCase();
			return fname1.compareTo(fname2);
			*/
			return o2.getDate().compareTo(o1.getDate());
			// TODO Auto-generated method stub
		}

	};
}
