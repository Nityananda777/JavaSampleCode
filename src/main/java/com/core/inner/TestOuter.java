package com.core.inner;

public class TestOuter implements Runnable {

	@Override
	public void run() {
		System.out.println(new Inner().x);
		// TODO Auto-generated method stub
	}
	private class Inner {
		private  int x = 10;;
	}


}
