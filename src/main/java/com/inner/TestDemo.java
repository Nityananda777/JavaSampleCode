package com.inner;

import java.util.HashSet;

import com.inner.Outer.InnerA;
import com.inner.Outer.InnerB;

abstract class InnerD {
	public void vv() {
		System.out.println("vv");
	}
}

class Outer {
	private int x = 30;
	private static int y = 50;

	abstract class InnerA {
		int x = 20;

		private void mm() {
			System.out.println("mm " + Outer.this.x);
		}
	}

	class InnerC extends InnerA {

		private void mm() {
			x = 50;
			System.out.println("mm " + Outer.this.x);
		}
		private  void mss() {
			
			System.out.println("mm " + Outer.this.x);
		}
	}

	private void Dii() {
		InnerA a=new InnerC();
		a.mm();
	}

	static final class InnerB {
		public void mm() {
			System.out.println("mm" + Outer.y);
		}
	}
}

public class TestDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		InnerB o = new InnerB();
		 
		new Outer().new InnerC();
	
	}
}
