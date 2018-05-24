package com.core.thread;

public class SingleTon {
	private static volatile SingleTon singleton;

	private SingleTon() {
		System.out.println("inside constructor");
	}

	public static SingleTon getInstance() {
		if (singleton == null) {
			synchronized (SingleTon.class) {
				if (singleton == null) {
					singleton = new SingleTon();
				}
			}
		}
		return singleton;
	}

}
