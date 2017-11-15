package com.core.java8;

interface interfaceS {
	default void test1() {
		System.out.println("Hello india");
	}

	static void method1() {
		System.out.println("Inside static method1");
	}

}

public class StaticMethodTes implements interfaceS {
	public void test1() {
		interfaceS.super.test1();
		System.out.println("Hello india of StaticMethodTes");
	}

	static void method1() {
		System.out.println("Inside static method1");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		interfaceS s = new StaticMethodTes();
		s.test1();
	}

}
