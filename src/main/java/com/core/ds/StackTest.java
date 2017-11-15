package com.core.ds;

class MyStack {
	int top=-1;
	int size;
	int arr[] = new int[10];

	public boolean isFull() {
		if (top == 10) {
			return true;
		}
		return false;
	}

	public boolean isEmpty() {
		if (top== -1) {
			return true;
		}
		return false;
	}

	public boolean push(int item) {
		if (!isFull()) {
			top=top+1;
			arr[top] = item;
			return true;
		}
		return false;
	}

	public int pop() {
		int val = 0;
		if (!isEmpty()) {
			top=top-1;
			val = arr[top];
	
		}
		return val;
	}
}

public class StackTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MyStack m = new MyStack();
		m.push(10);
		m.push(20);
		m.push(30);
		m.push(40);
		System.out.println(m.pop());

		System.out.println(m.pop());

		System.out.println(m.pop());

		System.out.println(m.pop());

	}

}
