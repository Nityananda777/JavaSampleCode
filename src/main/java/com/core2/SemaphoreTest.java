package com.core2;

import java.util.concurrent.Semaphore;

public class SemaphoreTest {

	public static void main(String args[]) {
		Semaphore s = new Semaphore(1);
		MutualExclusive m = new MutualExclusive();
		Thread t1 = new Thread(new SThread1(s, m));
		Thread t2 = new Thread(new SThread2(s, m));
		t1.start();
		t2.start();
	}

}
