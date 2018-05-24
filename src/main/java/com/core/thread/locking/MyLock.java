package com.core.thread.locking;

import java.util.concurrent.TimeUnit;
import java.util.concurrent.locks.Condition;

public interface MyLock {

	void lock();

	void unlock();

	boolean tryLock();

	void tryLock(long time, TimeUnit unit);

	void lockInterruptly();

	Condition newCondition();
}
