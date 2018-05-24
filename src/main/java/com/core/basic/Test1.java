package com.core.basic;


class XM {

	public void mm() {
		// TODO Auto-generated method stub
		System.out.println("hello world");
	}

	public void m1() {
		// TODO Auto-generated method stub
		System.out.println("hello india  X");
		mm();
	}
}

class XL extends XM {

	public void mm() {
		// TODO Auto-generated method stub

		System.out.println("hello india  XL");
	}

}

public class Test1 {

	public static void main(String[] args) {
		XL x = new XL();
		x.m1();
	}
}
