package com.core.ds.recursion.basic.array;

import java.util.Arrays;

class MyArrayList<T> {

	Object[] table;
	int size = 4;
	int position;

	MyArrayList() {
		table = new Object[4];
	}

	public void add(T data) {

		if (table[position] != data) {
			table[position] = data;
			position++;
		} else if (table.length == size) {
			table = resize();
			table[position++] = data;
			position++;
		} else {
			table[position++] = data;
			position++;
		}
	}

	public Object get(int key) {
		return table[key];
	}

	public void remove(T data) {
		if (table[position] == data) {

		}
	}

	public void reverse() {
		for (int i = table.length - 1; i >= 0; i--) {
			System.out.println(table[i]);
		}
	}

	public Object[] resize() {
		table = Arrays.copyOf(table, table.length * 16);
		return table;

	}
}

public class ArrayListTest {
	public static void main(String[] args) {
		MyArrayList<Integer> l = new MyArrayList<Integer>();
		l.add(20);
		l.add(30);
		l.add(10);
		l.reverse();
		System.out.println(l);

	}
}
