package com.core.inner;

abstract class OuterTest {
	int x = 10;

	public abstract void test();

	public void test1() {
		System.out.println("Hello india");
	}
}

public class AnnonymusTest {
	int z = 30;

	public void methodM() {
		new OuterTest() {
			
			int x = 20;
			int y = 10;

			public void test() {
				System.out.println("Hello world " + "" + this.getClass());
			}

			public void test1() {
				System.out.println("Hello US " + y + " " + this.getClass());
			}
		}.test();
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		AnnonymusTest m = new AnnonymusTest();
		m.methodM();
	}

}
