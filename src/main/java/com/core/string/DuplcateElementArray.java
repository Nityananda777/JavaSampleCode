package com.core.string;

public class DuplcateElementArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a[] = { 10, 20, 30, 40,30,40, 10, 34 };
		for (int i = 0; i < a.length; i++) {
			for (int j = i + 1; j < a.length; j++) {
				if (a[i] == a[j])
					System.out.println("duplcate are " + a[i]);
			}
		}
	}

}
