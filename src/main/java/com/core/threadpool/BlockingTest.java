package com.core.threadpool;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Future;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

public class BlockingTest {

	public static void main(String[] args) throws InterruptedException, ExecutionException {
		BlockingQueue<Runnable> hl = new LinkedBlockingQueue<Runnable>();
		MyRejectedExecutionHandler rh = new MyRejectedExecutionHandler();
		int size = 4;
		List<Callable> list = new ArrayList<Callable>();
		list.add(new ProducerThread(hl, size));
		list.add(new ConsumerThread(hl, size));
		int corePoolSize = 5;
		int maxPoolSize = 10;
		long keepAliveTime = 5000;
		List<Future<String>> lists = new ArrayList<Future<String>>();
		ExecutorService threadPoolExecutor = new ThreadPoolExecutor(corePoolSize, maxPoolSize, keepAliveTime,
				TimeUnit.MILLISECONDS, new LinkedBlockingQueue<Runnable>(), new CustomThreadFactory("ff"), rh);
		for (Callable r : list) {
			Future<String> f = threadPoolExecutor.submit(r);
			lists.add(f);
		}
		for (Future ff : lists) {
			System.out.println("list of task are" + ff.get());
			threadPoolExecutor.shutdown();
		}
	}
}
