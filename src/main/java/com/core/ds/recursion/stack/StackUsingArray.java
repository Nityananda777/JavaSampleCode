package com.core.ds.recursion.stack;

public class StackUsingArray {
	int size = 10;
	int stack[] = new int[size];
	int top = -1;

	// Returns top of stack
	boolean isFull() {
		if (top == size) {
			System.out.println("Stack is full");
			return true;
		}
		return false;
	}

	// Returns true if Stack is empty else false
	boolean isEmpty() {
		if (top == -1) {
			System.out.println("Stack is empty");
			return true;
		}
		return false;
	}

	boolean push(int val) {
		if (!isFull()) {
			stack[++top] = val;
			return true;
		}
		return false;

	}

	// Removes the top element
	int pop() {
		int x = 0;
		if (!isEmpty()) {
			x = stack[top];
			top--;
		}
		return x;
	}

	// Driver program to test above methods
	public static void main(String[] args) {
		StackUsingArray s = new StackUsingArray();
		s.push(10);
		s.push(20);
		s.push(25);
		s.push(40);
		s.push(50);
		s.push(30);
		System.out.println("Top element :" + s.pop());
		System.out.println("Top element :" + s.pop());
		System.out.println("Top element :" + s.pop());
		System.out.println("Top element :" + s.pop());
		System.out.println("Top element :" + s.pop());
		System.out.println("Top element :" + s.pop());
		System.out.println("Top element :" + s.pop());
		System.out.println("Top element :" + s.pop());
	}
}