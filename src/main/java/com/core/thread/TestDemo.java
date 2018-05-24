package com.core.thread;

import java.util.concurrent.CyclicBarrier;

public class TestDemo {
	public static void main(String args[]) throws InterruptedException {
		   //creating CyclicBarrier with 3 parties i.e. 3 Threads needs to call await()
        final CyclicBarrier cb = new CyclicBarrier(3, new Runnable(){
            public void run(){
                //This task will be executed once all thread reaches barrier
                System.out.println("All parties are arrived at barrier, lets play");
                
            }
        });
        //starting each of thread
        Thread t1 = new Thread(new WorkerThread1(cb), "Thread 1");
        Thread t2 = new Thread(new WorkerThread2(cb), "Thread 2");
        Thread t3 = new Thread(new WorkerThread3(cb), "Thread 3");

        t1.start();
        t2.start();
        t3.start();
    }
	}
