package com.core;

import java.util.Collections;
import java.util.concurrent.CountDownLatch;

public class Test {

	public static void main(String args[]) throws InterruptedException {

		CountDownLatch latch = new CountDownLatch(3);
		MyThread1 first = new MyThread1(1000, latch, "MyThread-1");
		MyThread2 second = new 	MyThread2(2000, latch, "MyThread-2");
		MyThread3 third = new 	MyThread3(3000, latch, "MyThread-3");
		
		first.start();
		second.start();
		third.start();
		// Main thread will wait until all thread finished
		latch.await();

		System.out.println(Thread.currentThread().getName() + " has finished");
	
	
	}

}


