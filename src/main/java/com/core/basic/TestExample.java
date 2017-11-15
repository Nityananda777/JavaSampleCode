package com.core.basic;

class Abc {
	public Abc mm(int x, String y) {
		System.out.println("Abc");
		return null;
	}
}

class Bde extends Abc {
	public Abc mm(int x, String y) {
		System.out.println("Bde");
		return null;
	}
}

public class TestExample {

	public static  void main(String[] args) {
		// TODO Auto-generated method stub

		Abc a = new Bde();
		a.mm(10, "raja");
	}

}
