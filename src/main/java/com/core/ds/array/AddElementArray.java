package com.core.ds.array;

public class AddElementArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a[] = new int[6];
		a[0] = 1;
		a[1] = 2;
		a[2] = 3;
		a[3] = 4;
		a[4] = 5;
		a=addFirst(a, 0, 10);
		for(int i:a)
		{
		System.out.println(i);	
		}

	}

	public static int[] addFirst(int[] a, int position, int x) {
		a[position] = x;
		a[position]=a[++position];
		
		return a;
	}
}
