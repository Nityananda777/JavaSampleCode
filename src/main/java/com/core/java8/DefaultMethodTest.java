package com.core.java8;

interface Interface1 {
	void method1();

	default void log(String arg) {
		System.out.println("Inside Interface1 log..");
	}

	default void log1(String arg) {
		System.out.println("Inside Interface1 log..");
	}
}

interface Interface2 {
	void method2();

	default void log(String arg) {
		System.out.println("Inside Interface2 log..");
	}
}

class InterfaceImpl implements Interface1, Interface2 {

	@Override
	public void method2() {
		// TODO Auto-generated method stub
		System.out.println("Inside method2 InterfaceImpl");
	}

	@Override
	public void method1() {
		// TODO Auto-generated method stub

		System.out.println("Inside method1 InterfaceImpl");
	}

	@Override
	public void log(String arg) {
		// TODO Auto-generated method stub
		Interface2.super.log(arg);
	}
}

public class DefaultMethodTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Interface2 i = new InterfaceImpl();
		i.log("Hello world");

	}

}
