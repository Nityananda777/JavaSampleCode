package com.core.thread.locking;

import java.util.concurrent.Semaphore;

public class SThread2 implements Runnable {
	Semaphore s;
	MutualExclusive m;

	SThread2(Semaphore s, MutualExclusive m) {
		this.s = s;
		this.m = m;
	}

	public void run() {
		System.out.println("MyThread2" + Thread.currentThread().getName());
		m.mutualExclusion(s);
	}

}
