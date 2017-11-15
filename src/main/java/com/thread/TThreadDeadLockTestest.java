package com.thread;

class Test {
	public synchronized void syncInstance() throws InterruptedException {
		System.out.println("inside syncInstance");
		Thread.sleep(1000);
		syncStatic(this);
	}

	public static synchronized void syncStatic(Test t) throws InterruptedException {
		Thread.sleep(1000);
		System.out.println("inside syncStatic");
		t.syncInstance();
	}
}

public class TThreadDeadLockTestest {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		Test t=new Test();
		new Thread(() -> {
			System.out.println(Thread.currentThread().getName());
				try {
					t.syncInstance();
				} catch (Exception e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
		}).start();
		Test.syncStatic(t);
		new Thread(() -> {
			System.out.println(Thread.currentThread().getName());
		}).start();
	}
}
