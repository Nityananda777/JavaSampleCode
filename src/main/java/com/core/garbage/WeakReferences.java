package com.core.garbage;

import java.lang.ref.WeakReference;

public class WeakReferences {

	public static void main(String[] args) {

		A a=new A();
		WeakReference<A> weakRef=new WeakReference<A>(a);
		a=null;
		System.out.println(weakRef.get().toString());
	}
}
