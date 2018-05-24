package com.core.threadpool;

import java.util.concurrent.BlockingQueue;
import java.util.concurrent.Callable;

public class ProducerThread implements Callable<String> {

	BlockingQueue<Integer> l;
	int size;

	ProducerThread(BlockingQueue l, int size) {
		this.l = l;
		this.size = size;
	}

	public String call() {
		for (int i = 0; i < 7; i++) {
			System.out.println("Produced: " + i);
			try {
				l.put(i);
				
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		return Thread.currentThread().getName();
	}
}
