package com.core3;

import java.util.concurrent.BlockingQueue;

public class ProducerThread2 implements Runnable {

	BlockingQueue<Integer> l;
	int size;

	ProducerThread2(BlockingQueue l, int size) {
		this.l = l;
		this.size = size;
	}

	public void run() {
		for (int i = 0; i < 7; i++) {
			System.out.println("Produced: " + i);
			try {
				l.put(i);
				
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
}
