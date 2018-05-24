package com.core.thread;

import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;
import java.util.concurrent.TimeoutException;

public class ThreadPoolExecutorDemo {

	public static void main(String[] args) throws InterruptedException, ExecutionException, TimeoutException {
		// TODO Auto-generated method stub
		Runnable task = () -> {
			System.out.println("Hello runnable thread" + Thread.currentThread().getName());
		};
		Callable<String> call = () -> {
			Thread.sleep(1000);
			// return "hello inside callable call method";
			throw new IllegalThreadStateException();
		};
		ExecutorService execute = Executors.newFixedThreadPool(2);
		try {
			for (int i = 0; i < 10; i++) {
				// new Thread(r1).start();
				// execute.execute(task);
				Future<String> future = execute.submit(call);
				String s = future.get();
				System.out.println("future method returning " + s);
			}
		} finally {
			execute.shutdown();
		}
	}

}
