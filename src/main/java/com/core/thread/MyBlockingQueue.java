package com.core.thread;

import java.util.LinkedList;
import java.util.Queue;
import java.util.concurrent.locks.AbstractQueuedLongSynchronizer.ConditionObject;
import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.ReentrantLock;

public class MyBlockingQueue {
	Queue q = new LinkedList<>();
	ReentrantLock lock = new ReentrantLock();
	Condition c1 = lock.newCondition();
	Condition c2 = lock.newCondition();

	public void put(Object o) {

	}

	public Object take() {
		return null;
	}
}
