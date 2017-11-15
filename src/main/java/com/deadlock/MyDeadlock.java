package com.deadlock;

public class MyDeadlock {
	public static void main(String[] args) {
		final String resource1 = "ratan jaiswal";
		final String resource2 = "vimal jaiswal";
		// t1 tries to lock resource1 then resource2

		new Thread(() -> {
			synchronized (resource1) {
				System.out.println("Thread 1: locked resource 1");
				try {
					Thread.sleep(100);
				} catch (Exception e) {
				}
				synchronized (resource2) {
					System.out.println("Thread 1: locked resource 2");
				}
			}
		}).start();;
		// t2 tries to lock resource2 then resource1

		new Thread( () -> {
			synchronized (resource2) {
				System.out.println("Thread 2: locked resource 1");
				try {
					Thread.sleep(100);
				} catch (Exception e) {
				}

				synchronized (resource1) {
					System.out.println("Thread 2: locked resource 2");
				}
			}
		}).start();
	}
}
