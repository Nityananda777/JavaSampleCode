package com.core.thread;

import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.locks.ReentrantLock;

public class ThreadsExample implements Runnable {
	static AtomicInteger counter = new AtomicInteger(1); // a global counter

	static ReentrantLock counterLock = new ReentrantLock(true); // enable
																// fairness
																// policy

	static void incrementCounter() {
		//counterLock.lock();
		// Always good practice to enclose locks in a try-finally block
		try {
			System.out.println(Thread.currentThread().getName() + ": " + counter);
			counter.incrementAndGet();
		} finally {
		//	counterLock.unlock();
		}
	}

	@Override
	public void run() {
		while (counter.get() < 1000) {
			try {
				Thread.sleep(100);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			incrementCounter();
		}
	}

	public static void main(String[] args) {
		ThreadsExample te = new ThreadsExample();
		Thread thread1 = new Thread(te);
		Thread thread2 = new Thread(te);

		thread1.start();
		thread2.start();
	}
}