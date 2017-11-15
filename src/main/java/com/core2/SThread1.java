package com.core2;

import java.util.concurrent.Semaphore;

public class SThread1 implements Runnable {
	Semaphore s;
	MutualExclusive m;
	SThread1(Semaphore s,MutualExclusive m) {
		this.s = s;
		this.m=m;
	}
	public void run() {
		System.out.println("MyThread1" + Thread.currentThread().getName());
		m.mutualExclusion(s);
	}

}
