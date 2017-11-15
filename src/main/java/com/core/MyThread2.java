package com.core;

import java.util.concurrent.CountDownLatch;

public class MyThread2 extends Thread {
	CountDownLatch latch;
	int delay;
	String name;

	public MyThread2(int delay, CountDownLatch latch, String name) {
		this.latch = latch;
		this.delay=delay;
		this.name=name;
		
	}


	public void run() {
		try {
			System.out.println("MyThread2 thread" + Thread.currentThread().getName());
			Thread.sleep(delay);
			latch.countDown();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
