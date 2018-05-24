package com.core.thread;

import java.util.List;

public class Producer implements Runnable {

	List<Integer> l;
	int size;

	public Producer(List<Integer> l, int size) {
		this.l = l;
		this.size = size;
	}

	public void run(){
			for (int i = 0; i < 5; i++) {
				System.out.println("Produced: " + i);
				try {
					produce(i);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
		}
	}
	private void produce(int i) throws InterruptedException {
			while (l.size() == this.size) {
			
					Thread.currentThread().join();
					System.out.println("Queue is full " + Thread.currentThread().getName() + " is waiting , size: "
							+ l.size());
				}
		
				l.add(i);
			
			}
	}


