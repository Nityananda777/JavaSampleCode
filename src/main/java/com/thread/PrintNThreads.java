package com.thread;

public class PrintNThreads {

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		int n = 10;
		Object[] lockObjects = new Object[n];
		for (int i = 0; i < n; i++) {
			lockObjects[i] = new Object();
		}

		for (int i = 0; i < n; i++) {
			new NumberThread("Thread-" + (i + 1), lockObjects[i], lockObjects[(i + 1) % n]).start();
		}

	}

}

class NumberThread extends Thread {

	static volatile int i = 0;

	static void printIncrement(String threadName) {
		System.out.println(threadName + " " + (++i));
	}

	Object thisLock;
	Object nextLock;
	final String threadName;

	public NumberThread(String threadName, Object thisLock, Object nextLock) {
		this.nextLock = nextLock;
		this.thisLock = thisLock;
		this.threadName = threadName;
	}
 
	public void run() {
		while (true) {
			synchronized (thisLock) {
				try {
					thisLock.wait();
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				synchronized (nextLock) {
					nextLock.notify();
					printIncrement(threadName);
				}
			}
		}
	}
}