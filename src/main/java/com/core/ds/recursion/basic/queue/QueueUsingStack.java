package com.core.ds.recursion.basic.queue;

class Stacks {
	int size = 5;
	int stack[] = new int[size];
	int top = -1;

	boolean isFull() {
		if (top == size) {
			System.out.println("Stack is full");
			return true;
		}
		return false;
	}

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

	int pop() {
		int x = 0;
		if (!isEmpty()) {
			x = stack[top];
			top--;
		}
		return x;
	}
}

public class QueueUsingStack {

	int size = 5;
	int[] queue = new int[size];
	int font, rear = 0;
	Stacks stack;

	QueueUsingStack() {
		stack = new Stacks();
	}

	public boolean isFull() {
		if (rear == size) {
			return true;
		}
		return false;
	}

	public boolean isEmpty() {
		if (stack.isEmpty()) {
			return true;
		}
		return false;
	}

	public void enQueue(int item) {
		if (!stack.isFull()) {
			stack.push(item);
			rear++;
		}
	}

	public int deQueue() {
		int val = 0;
		if (!stack.isEmpty()) {
			val = stack.pop();
			font++;
		}
		return val;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		QueueUsingStack s = new QueueUsingStack();
		s.enQueue(10);
		s.enQueue(12);
		s.enQueue(13);
		s.enQueue(14);
		s.enQueue(15);
		System.out.println(s.deQueue());
		System.out.println(s.deQueue());
		System.out.println(s.deQueue());
		System.out.println(s.deQueue());
		System.out.println(s.deQueue());
	}

}
