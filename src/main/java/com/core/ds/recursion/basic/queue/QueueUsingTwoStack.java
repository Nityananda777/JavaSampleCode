package com.core.ds.recursion.basic.queue;

public class QueueUsingTwoStack {

	int size = 5;
	int[] queue = new int[size];
	int font=-1; 
	int rear = 0;
	Stacks stack1;
	Stacks stack2;

	QueueUsingTwoStack() {
		stack1 = new Stacks();
		stack2 = new Stacks();
	}

	public boolean isFull() {
		if (stack1.isFull()) {
			return true;
		}
		return false;
	}

	public boolean isEmpty() {
		if (stack1.isEmpty()) {
			return true;
		}
		return false;
	}

	public void enQueue(int item) {
		if (!isFull()) {
			stack1.push(item);
		}
	}

	public int deQueue() {
		if (stack2.isEmpty()) {
			while (!isEmpty()) {
				stack2.push(stack1.pop());
			}
		}
		return stack2.pop();
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		QueueUsingTwoStack s = new QueueUsingTwoStack();
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
