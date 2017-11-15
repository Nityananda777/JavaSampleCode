package com.core3;

import java.util.concurrent.BlockingQueue;

public class ThreadPool {

	BlockingQueue<Runnable> queue;

	public ThreadPool(int queueSize, int nThread)
	{
	}
	public void submitTask(Runnable task) throws InterruptedException {
		Thread t = new Thread(task);
		t.start();
	}

}