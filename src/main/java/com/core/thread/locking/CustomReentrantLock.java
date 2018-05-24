package com.core.thread.locking;

import java.util.concurrent.TimeUnit;
import java.util.concurrent.locks.Condition;

public class CustomReentrantLock implements MyLock {
	int lockHoldCount;
	long IdOfThreadCurrentlyHoldingLock;

	CustomReentrantLock() {
		lockHoldCount = 0;
	}

	@Override
	public synchronized void lock() {
		if (lockHoldCount == 0) {
			lockHoldCount++;
			IdOfThreadCurrentlyHoldingLock = Thread.currentThread().getId();
		} else if (lockHoldCount > 0 && IdOfThreadCurrentlyHoldingLock == Thread.currentThread().getId()) {
			lockHoldCount++;
		}
		// wait for another thread
		else {
			try {
				wait();
				lockHoldCount++;
				IdOfThreadCurrentlyHoldingLock = Thread.currentThread().getId();
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}

		}
	}

	@Override
	public synchronized void unlock() {
		if (lockHoldCount == 0) {
			throw new IllegalArgumentException("lock is already released");
		}
		lockHoldCount--;
		if (lockHoldCount == 0) {
			notify();
		}
	}

	@Override
	public synchronized boolean tryLock() {
		if (lockHoldCount == 0) {
			lock();
			return true;
		} else {
			return false;
		}

	}

	@Override
	public void tryLock(long time, TimeUnit unit) {
		// TODO Auto-generated method stub

	}

	@Override
	public void lockInterruptly() {
		// TODO Auto-generated method stub

	}

	@Override
	public Condition newCondition() {
		// TODO Auto-generated method stub
		return null;
	}

	public static void main(String[] args) {
		MyLock l = new CustomReentrantLock();
		MyRunnables r = new MyRunnables(l);
		Thread t1 = new Thread(r);
		t1.start();
		Thread t2 = new Thread(r);
		t2.start();
	}

}

class MyRunnables implements Runnable {
	MyLock lock;

	public MyRunnables(MyLock lock) {
		// TODO Auto-generated constructor stub
		this.lock = lock;
	}

	@Override
	public void run() {

		// TODO Auto-generated method stub
		getData();
		display();
	}

	private void getData() {
		System.out.println(Thread.currentThread().getName() + "waiting to acquired the lock");
		lock.lock();

		System.out.println(Thread.currentThread().getName() + "acquired the lock with count 1");
		lock.lock();
		System.out.println(Thread.currentThread().getName() + " has called lock(), lockHoldCount=2 ");

	}

	private void display() {
		System.out
				.println(Thread.currentThread().getName() + " is about to call unlock(), lockHoldCount will become 1 ");
		lock.unlock();
		System.out
				.println(Thread.currentThread().getName() + " is about to call unlock(), lockHoldCount will become 0 ");
		lock.unlock();
	}
}