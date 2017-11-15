package com.core.java8;

interface infer {
	void m();
}

class Test {
	int x = 10;

	public void method1() {
		int y=12;
		
		infer i = () -> {
			System.out.println("hello india" + x + " " + "" + this.getClass());
		};
		i.m();
	}
}

public class LamdaTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Test t = new Test();
		t.method1();
	}

}
