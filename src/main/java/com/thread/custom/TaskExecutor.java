package com.thread.custom;

import java.util.concurrent.BlockingQueue;

public class TaskExecutor implements Runnable {
	BlockingQueue queue;

	public TaskExecutor(BlockingQueue queue) {
		this.queue = queue;
	}

	@Override
	public void run() {
		try {
			while (true) {
				String name = Thread.currentThread().getName();
				//Runnable task = queue.take()
				System.out.println("Task Started by Thread :" + name);
			//	task.run();
				System.out.println("Task Finished by Thread :" + name);
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
