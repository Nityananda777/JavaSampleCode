package com.thread;

import java.util.ArrayList;
import java.util.List;

public class TestThread {
	public static void main(String[] args) {
		List<Integer> l = new ArrayList<Integer>();
		int size=4;
		Thread t1 = new Thread(new Producer(l, size));
		t1.start();
		Thread t2 = new Thread(new Consumer(l, size));
		t2.start();
		System.out.println("main threaddd");
	}
}
