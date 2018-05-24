package com.core.thread;

public class CustomThreadPool {
	private BlockingQueue<Runnable> queue;
	private boolean shutdown;

	public CustomThreadPool(int noThread, int size) {
		// TODO Auto-generated constructor stub
		queue = new BlockingQueueSemaphore(size);
		for (int i = 0; i < noThread; i++) {
			WorkerThread t2 = new WorkerThread(queue, this);
			Thread t = new Thread(t2);
			t.start();
		}
	}
	public void execute(Runnable r) throws InterruptedException {
		if (isShutDownNow()) {
			throw new InterruptedException("shutdown  is already initiated");
		}
		queue.put(r);
		// System.out.println("queue size is.."+queue.size());
	}

	public boolean isShutDownNow() {
		return shutdown;
	}

	public void shutDown() {
		shutdown = true;
		System.out.println("inside shutdown");
	}

	public void shutDownNow() {
		shutdown = true;
		System.out.println("inside shutdownNowF");
		Thread.currentThread().interrupt();
	}

	public static void main(String[] args) throws InterruptedException {
		CustomThreadPool pool = new CustomThreadPool(3, 5);
		for (int i = 0; i < 10; i++) {
			TaskThread t = new TaskThread("Task " + i);
			pool.execute(t);
		}
		pool.shutDownNow();
	}
}

class WorkerThread implements Runnable {
	private BlockingQueue<Runnable> queue;
	private CustomThreadPool pool;

	WorkerThread(BlockingQueue<Runnable> queue, CustomThreadPool pool) {
		this.pool = pool;
		this.queue = queue;
	}

	@Override
	public void run() {
		// TODO Auto-generated method stub
		while (true) {
			Runnable r;
			try {
				r = queue.take();
				r.run();
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
}

class TaskThread implements Runnable {
	String name;

	TaskThread(String name) {
		this.name = name;
	}

	@Override
	public void run() {
		// TODO Auto-generated method stub
		System.out.println(Thread.currentThread().getName() + "executing " + name);
	}
}
