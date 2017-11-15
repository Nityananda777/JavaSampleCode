package com.core3;

import java.util.concurrent.BlockingQueue;

public class ConsumerThread2 implements Runnable {
	BlockingQueue<Runnable> l;
	int size;

	ConsumerThread2(BlockingQueue<Runnable> l, int size) {
		this.l = l;
		this.size = size;
	}

	public void run() {
		try {
			while (true) {
				System.out.println("Consuming Thraed" +l.take());
				Thread.sleep(1000);
			
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
