package com.thread;

public class SynchronizeTest1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new SynchronizeTest1().m1();	
	}
	synchronized void m1()
	{
	m2();
	m3();
	}
	synchronized void m2()
	{
	System.out.println("m2");	
	}
	synchronized void m3()
	{
	System.out.println("m3");	
	}

}
