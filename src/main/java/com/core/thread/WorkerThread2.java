package com.core.thread;

import java.util.concurrent.BrokenBarrierException;
import java.util.concurrent.CyclicBarrier;

public class WorkerThread2 implements Runnable {
	CyclicBarrier latch;

	public WorkerThread2(CyclicBarrier latch) {
		this.latch = latch;


	}

	public void run() {
	
			System.out.println("WorkerThread2 thread" + Thread.currentThread().getName());
			//Thread.sleep(delay);
			try {
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


