package com.core.ds.recursion.basic.array;

public class AddElementArray {

	int n = 5;
	static int a[] = new int[6];

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		AddElementArray aa = new AddElementArray();
		aa.insert(a);
		// aa.find(a, 40);
		System.out.println(aa.findB(a, 40));
		// aa.delete(a, 40);
		// aa.display();
	}

	public void insert(int a[]) {
		a[0] = 10;
		a[1] = 20;
		a[2] = 30;
		a[3] = 40;
		a[4] = 50;
	}

	public void find(int a[], int key) {
		for (int i = 0; i < n; i++) {
			if (a[i] == key && i != n) {
				System.out.println("element is " + a[i]);
				break;
			}
		}
	}

	public int findB(int a[], int key) {
		int l = 0;
		int h = a.length - 1;
		int m = 0;
		while (l<=h) {
			m = (l + h) / 2;
			if (a[m] == key) {
				System.out.println("element is found " + a[m]);
				return m;
			} else {
				if (a[m] < key) {
					l = m + 1;
				} else {
					h = m - 1;
				}
				
			}
		}
		return m;
	}

	public void delete(int a[], int key) {
		for (int i = 0; i < n; i++) {
			if (a[i] == key) {
				System.out.println("element need to be deleted is " + a[i]);
				for (int j = i; j < a.length - 1; j++) {
					a[j] = a[j + 1];
				}
			}
		}
	}

	public void display() {
		for (int k = 0; k < n - 1; k++) {
			System.out.println(a[k]);
		}
	}

}
