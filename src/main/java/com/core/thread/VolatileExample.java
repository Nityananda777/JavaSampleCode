package com.core.thread;

public class VolatileExample {
	static int c = 0;

	public static void main(String[] args) {
		Thread thread1 = new Thread() {

			public void run() {
				for (int i = 0; i < 10; i++)
					c++;
				System.out.println("writer: changed value to = " + c);
				try {
					Thread.sleep(10000000);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}


			}
		};

		Thread thread2 = new Thread() {
			int temp = 0;

			public void run() {

				for (int i = 0; i < 10; i++)
					if (temp != c) {
						temp=c;
						System.out.println("reader: value of c = " + c);
					}
				
			}
		};

		thread1.start();
		thread2.start();
	}
}
