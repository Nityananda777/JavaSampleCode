package com.thread;

import java.util.LinkedList;
import java.util.List;

interface BlockingQueue<E> {
	void put(E item) throws InterruptedException;

	E take() throws InterruptedException;
}

public class CustomBlockingQueue<E> implements BlockingQueue<E> {
	List<E> queue;
	int size;

	CustomBlockingQueue(int size) {
		queue = new LinkedList<E>();
		this.size = size;

	}

	public synchronized E take() throws InterruptedException {
		if(queue.isEmpty()) {
			System.out.println("wait !! Queue is empty.. size " + queue.size());
			this.wait();
		}
		this.notifyAll();
		return queue.remove(0);

	}

	@Override
	public synchronized void put(E item) {
		// TODO Auto-generated method stub
		if (queue.size() == size) {
			try {
				System.out.println("wait !! Queue is full ..size" + queue.size());
				this.wait();
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		queue.add(item);
		this.notifyAll();
	}
}