package com.core.thread;

import java.util.LinkedList;
import java.util.List;
import java.util.concurrent.Semaphore;

public class BlockingQueueSemaphore<E> implements BlockingQueue<E> {
	Semaphore slot;// empty
	Semaphore filed;// filed
	Semaphore mutux;
	int size;
	List<E> queue = new LinkedList<>();

	BlockingQueueSemaphore(int size) {
		this.size = size;
		slot = new Semaphore(size);
		filed = new Semaphore(0);
		mutux = new Semaphore(1);
	}

	@Override
	public void put(E item) throws InterruptedException {
		// TODO Auto-generated method stub
		slot.acquire();
		mutux.acquire();
		queue.add(item);
		mutux.release();
		filed.release();
	}
	@Override
	public E take() throws InterruptedException {
		// TODO Auto-generated method stub
		filed.acquire();
		mutux.acquire();
		E o = queue.remove(0);
		mutux.release();
		slot.release();
		return o;
	}
}
