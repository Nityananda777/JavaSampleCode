package com.core.generic;

import java.util.ArrayList;
import java.util.List;

public class Test {

	public static void process(List<? super A> list) {
		for (Object a : list) {
			A S = (A) list.get(0);
			System.out.println(S.getValue());
		}
	}

	public static void main(String[] args) {

		A a = new A();
		B b = new B();
		C c = new C();
		AA aa = new AA();
		List<B> listB = new ArrayList<>();
		List<A> listA = new ArrayList<>();
		List<C> listC = new ArrayList<>();
		List<AA> listaa = new ArrayList<>();
		// listA.add(a);
		listB.add(b);
		listC.add(c);
		listaa.add(aa);
		process(listaa);
	}
}

class AA {
}

class A extends AA {
	public String getValue() {
		return "10";
	}
}

class B extends A {
	public String getValue() {
		return "20";
	}
}

class C extends A {
	public String getValue() {
		return "30";
	}
}