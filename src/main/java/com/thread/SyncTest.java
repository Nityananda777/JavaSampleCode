package com.thread;

public class SyncTest {
	synchronized void m1() {
		System.out.println("inside m1");
	}

	synchronized void m3() {
		System.out.println("inside m3");
	}

	static synchronized void m2() {
		System.out.println("inside m2");
	}

	static synchronized void m4() {
		System.out.println("inside m4");
	}

	synchronized void m5() throws InterruptedException {
		System.out.println("inside m5");
		Thread.sleep(100);
		m1();
		m2();
	}

	synchronized void m6() throws InterruptedException {
		System.out.println("inside m6");
		Thread.sleep(100);
		m1();
		m3();
	}


	public static void main(String[] args) {
		SyncTest t=new SyncTest();
		Thread1 t1 = new Thread1(t);
		Thread2 t2 = new Thread2(t);
		t1.start();
		t2.start();

		System.out.println("inside main");
	}
}

class Thread1 extends Thread {
	SyncTest t;

	Thread1(SyncTest t) {
		this.t = t;
	}

	public void run() {
		try {
			t.m5();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}

class Thread2 extends Thread {
	SyncTest t;

	Thread2(SyncTest t) {
		this.t = t;
	}

	public void run() {
		try {
			t.m6();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}