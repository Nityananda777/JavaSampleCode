package com.core.ds;

class MyQueue {
	int rear = -1;
	int font = 0;
	int size = 5;
	int arr[] = new int[size];

	public boolean isFull() {
		return (rear == size - 1);
	}

	public boolean isEmpty() {
		return (font == rear + 1);
	}

	public void enQueue(int item) {
		if (isFull()) {
			System.out.println("Queue is full");
			return;
		} else {
			rear = rear + 1;
			arr[rear] = item;
		}
	}
	public int deQueue() {
		int val = 0;
		if (isEmpty()) {
			System.out.println("Queue is empty");
		} else {
			val = arr[font];
			font=font+1;
		}
		return val;
	}
}

public class ArrayQueue {

	public static void main(String[] args) {
		MyQueue q = new MyQueue();
		q.enQueue(10);
		q.enQueue(20);
		q.enQueue(30);
		q.enQueue(40);
		System.out.println(q.deQueue());
		System.out.println(q.deQueue());
		System.out.println(q.deQueue());
		System.out.println(q.deQueue());
	}
}
