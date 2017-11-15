package com.core.garbage;

import java.lang.ref.PhantomReference;
import java.lang.ref.ReferenceQueue;

public class PhantumReference {
	public static void main(String[] args) {

		A a = new A();
		ReferenceQueue<A> refQueue = new ReferenceQueue<A>();
		PhantomReference<A> p = new PhantomReference<A>(a, refQueue);
		a = null;
		System.out.println(p.get());
	}
}
