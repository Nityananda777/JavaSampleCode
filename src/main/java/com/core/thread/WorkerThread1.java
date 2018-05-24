package com.core.thread;

import java.util.concurrent.BrokenBarrierException;
import java.util.concurrent.CyclicBarrier;

public class WorkerThread1 implements Runnable {
	CyclicBarrier latch;

	public WorkerThread1(CyclicBarrier latch) {
		this.latch = latch;


	}

	public void run() {
	
			System.out.println("WorkerThread1 thread" + Thread.currentThread().getName());
			//Thread.sleep(delay);
			try {
				System.out.println("inside WorkerThread1");
				latch.await();
			} catch (BrokenBarrierException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}


