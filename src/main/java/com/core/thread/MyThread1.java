package com.core.thread;

import java.util.concurrent.CountDownLatch;

public class MyThread1 extends Thread {
	CountDownLatch latch;
	int delay;
	String name;

	public MyThread1(int delay, CountDownLatch latch, String name) {
		this.latch = latch;
		this.delay=delay;
		this.name=name;

	}

	public void run() {
		try {
			System.out.println("MyThread1 thread" + Thread.currentThread().getName());
			Thread.sleep(delay);
			latch.countDown();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
