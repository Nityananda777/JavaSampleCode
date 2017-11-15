package com.thread;

public class OldEvenTest {
	int val = 50;
	boolean odd = false;

	public static void main(String[] args) {

		OldEvenTest test = new OldEvenTest();
		Thread t1 = new Thread(new OddThread(test));
		Thread t2 = new Thread(new EvenThread(test));
		t1.start();
		t2.start();
	}
}

class OddThread implements Runnable {
	OldEvenTest test;

	OddThread(OldEvenTest test) {
		this.test = test;

	}

	@Override
	public void run() {
		// TODO Auto-generated method stub
		for (int i = 0; i < test.val; i++) {
			synchronized (test) {
				if (test.odd == false)
					try {
						test.wait();
					} catch (InterruptedException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
				if (i % 2!= 0) {
				System.out.println("odd no  " + i);
				}
				test.odd = true;
				test.notify();
			}
		}
	}
}

class EvenThread implements Runnable {
	OldEvenTest test;

	EvenThread(OldEvenTest test) {
		this.test = test;

	}

	@Override
	public void run() {
		// TODO Auto-generated method stub
		for (int i = 0; i < test.val; i++) {
			synchronized (test) {
				if (test.odd == true)
					try {
						test.wait();
					} catch (InterruptedException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
				if (i % 2 == 0) {
					System.out.println("even no " + i);
				}
				test.odd = false;
				test.notify();
			}
		}
	}
}
