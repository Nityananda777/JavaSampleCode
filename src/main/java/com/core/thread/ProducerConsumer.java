package com.core.thread;

import java.util.ArrayList;
import java.util.List;

public class ProducerConsumer {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List l = new ArrayList();
		int size = 3;
		new Thread(new ProducerJoin(l, size)).start();
		new Thread(new ConsumerrJoin(l, size)).start();
	}

}

class ProducerJoin implements Runnable {
	List l;
	int size;

	ProducerJoin(List l, int size) {
		this.l = l;
		this.size = size;
	}

	public void produce(int i) throws InterruptedException {
		if (l.size() == this.size) {
			System.out.println("Queue is full " + Thread.currentThread().getName() + " is waiting , size: "
					+ l.size());
			Thread.currentThread().join();
		} else {
			l.add(i);
		}
	}

	@Override
	public void run() {
		// TODO Auto-generated method stub
		for (int i = 0; i < 5; i++) {
			System.out.println("Produced: " + i);
			try {
				produce(i);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
}

class ConsumerrJoin implements Runnable {
	List l;
	int size;

	public ConsumerrJoin(List l, int size) {
		this.l = l;
		this.size = size;
	}

	public int consumer() {
		while(true)
		{
			if (l.isEmpty()) {
				try {
					System.out.println("Queue is empty " + Thread.currentThread().getName() + " is waiting , size: "
							+ l.size());
					Thread.currentThread().join();
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
			return	(int) l.remove(0);	
		// TODO Auto-generated method stub

	}
	}

	@Override
	public void run() {
		// TODO Auto-generated method stub
		System.out.println("Consumed:" + consumer());
	}
}