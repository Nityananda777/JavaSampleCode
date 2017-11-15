package com.core3;

import java.util.concurrent.BlockingQueue;
import java.util.concurrent.Callable;

public class ConsumerThread implements Callable<String> {
	BlockingQueue<Runnable> l;
	int size;

	ConsumerThread(BlockingQueue<Runnable> l, int size) {
		this.l = l;
		this.size = size;
	}

	public String call() {
		try {
			while (true) {
				System.out.println("Consuming Thraed" +l.take());
				Thread.sleep(1000);
			
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		return Thread.currentThread().getName();
	}
}
