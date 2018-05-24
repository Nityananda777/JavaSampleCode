package com.core.thread;

import java.util.concurrent.CyclicBarrier;

public class WorkerThread4 extends Thread {
	CyclicBarrier latch;
	int delay;
	String name;

	public WorkerThread4(String name) {
		this.name = name;

	}

	public void run() {
		System.out.println("WorkerThread1 thread" + Thread.currentThread().getName());
		System.out.println("All barrier meet");

	}

}
