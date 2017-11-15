package com.core.basic;

public class UserDefinedType {

	static int methodOne(int a[]) {
		a[1]=2;
		return 1;
	}

	public static void main(String[] args) {
		int a[] = new int[6];
		a[0] = 20;
		a[1] = 30;
		UserDefinedType.methodOne(a);
		System.out.println(a[1]);
	}
}
