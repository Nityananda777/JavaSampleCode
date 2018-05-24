package com.core.thread;

public class SngletonMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		DCLSingleton in=DCLSingleton.instance();
	}
}

class DCLSingleton {

	private  volatile static DCLSingleton _instance = null;

	private DCLSingleton() {
	}

	public static DCLSingleton instance() {
		if (_instance == null) { // 1st check
			synchronized (DCLSingleton.class) {
				if (_instance == null) // 2nd check
				{
					_instance = new DCLSingleton();
				}
			}
		}
		return _instance;
	}
}