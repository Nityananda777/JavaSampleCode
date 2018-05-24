package com.core.thread;

public class SynchronizeThread {

	public static void main(String[] args) {
		SynchronizeThread s = new SynchronizeThread();
		Thread t1 = new Thread(new ThreadA(s));
		Thread t2 = new Thread(new ThreadB(s));
		t1.start();
		t2.start();
	}

	public synchronized void m4() {
	}

	public synchronized void m5() {
	}

	public static synchronized void m1() {
	}

	public static synchronized void m2() {

	}
}

class ThreadA implements Runnable {
	SynchronizeThread s;

	ThreadA(SynchronizeThread s) {
		this.s = s;
	}

	@Override
	public void run() {
		// TODO Auto-generated method stub
		s.m5();
	}
}

class ThreadB implements Runnable {
	SynchronizeThread s;

	ThreadB(SynchronizeThread s) {
		this.s = s;
	}

	@Override
	public void run() {
		// TODO Auto-generated method stub
		s.m4();
	}
}
