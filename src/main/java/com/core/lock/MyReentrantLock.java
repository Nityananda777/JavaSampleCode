package com.core.lock;

import java.util.concurrent.TimeUnit;
import java.util.concurrent.locks.Condition;

public class MyReentrantLock implements MyLock {
	int lockHoldCount;
	long IdOfThreadCurrentlyHoldingLock;

	MyReentrantLock() {
		lockHoldCount = 0;
	}

	@Override
	public synchronized void lock() {
		// TODO Auto-generated method stub
		// Acquires the lock if it is not held by another thread.
		// And sets lock hold count to 1.
		if (lockHoldCount == 0) {
			lockHoldCount++;
			IdOfThreadCurrentlyHoldingLock = Thread.currentThread().getId();
		}
		// If current thread already holds lock then lock hold
		// count is increased by 1.
		else if (lockHoldCount > 0 && IdOfThreadCurrentlyHoldingLock == Thread.currentThread().getId()) {
			lockHoldCount++;
		}
		// If the lock is held by another thread then the current
		// thread waits for another thread to release lock.
		else {
			try {
				wait();
				lockHoldCount++;
				IdOfThreadCurrentlyHoldingLock = Thread.currentThread().getId();
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}

	@Override
	public synchronized void unlock() {
		// TODO Auto-generated method stub
		// current thread is not holding the lock, throw
		// IllegalMonitorStateException.
		if (lockHoldCount == 0)
			throw new IllegalMonitorStateException();

		lockHoldCount--; // decrement lock hold count by 1

		// if lockHoldCount is 0, lock is released, and
		// one waiting thread is notified.
		if (lockHoldCount == 0)
			notify();
	}

	@Override
	public synchronized boolean tryLock() {
		// TODO Auto-generated method stub
		// Acquires the lock if it is not held by another thread and
		// returns true
		if (lockHoldCount == 0) {
			lock();
			return true;
		}
		// If lock is held by another thread then method return false.
		else
			return false;
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
		MyLock LockCustom = new MyReentrantLock();
		MyRunnable myRunnable = new MyRunnable(LockCustom);
		new Thread(myRunnable, "Thread-1").start();
		new Thread(myRunnable, "Thread-2").start();
	}

}

class MyRunnable implements Runnable {

	MyLock lockCustom;

	public MyRunnable(MyLock LockCustom) {
		this.lockCustom = LockCustom;
	}

	public void run() {

		System.out.println(Thread.currentThread().getName() + " is Waiting to acquire LockCustom");

		lockCustom.lock();

		System.out.println(Thread.currentThread().getName() + " has acquired LockCustom.");

		try {
			Thread.sleep(5000);
			System.out.println(Thread.currentThread().getName() + " is sleeping.");
		} catch (InterruptedException e) {
			e.printStackTrace();
		}

		System.out.println(Thread.currentThread().getName() + " has released LockCustom.");

		lockCustom.unlock();
	}
}
