package com.core.thread;

import java.util.List;

public class Consumer implements Runnable {
	List<Integer> l;
	int size;

	public Consumer(List<Integer> l, int size) {
		this.l = l;
		this.size = size;
	}

	public void run() {
		while (true) {
			try {
				System.out.println("Consumed: " + consume());
				Thread.sleep(50);
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
	}

	private int consume() throws InterruptedException {
		while (l.isEmpty()) {
			Thread.currentThread().join();
			System.out
					.println("Queue is empty " + Thread.currentThread().getName() + " is waiting , size: " + l.size());
		}
		return l.remove(0);
	}
}
