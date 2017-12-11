package com.thread;

class MyRunnable implements Runnable {
	public void run() {
		System.out.println("hello");
	}
}

public class ThreadDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Thread.currentThread().start();

	}

}
