package com.core3;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.BlockingQueue;

public class TestThreadPool {
    public static void main(String[] args) throws InterruptedException {
    	//create queue size - 3
    	//Number of threads - 4
    	int queueSize =2;
    	BlockingQueue<Runnable> queue=new ArrayBlockingQueue<>(queueSize);
    	int threadCount=2;
    	List<Runnable> list = new ArrayList<Runnable>(); 
        ThreadPool threadPool = new ThreadPool(queueSize,threadCount);
        //Created 15 Tasks and submit to pool
        
        for (int count = 0; count < threadCount; count++) {
            list.add(new ProducerThread2(queue, queueSize));
    		list.add(new ConsumerThread2(queue, queueSize));
        }
        for(Runnable c:list)
        {
        	threadPool.submitTask(c);
        }
    
}
}
