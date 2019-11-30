package com.core.ds.array;

class MyQueue {
	int rear = 0;
	int font = 0;
	int size = 5;
	int arr[] = new int[size];

	public boolean isFull() {
		System.out.println("rear is" + rear);
		return (rear == size - 1);
	}

	public boolean isEmpty() {
		return (font == rear);
	}

	public void enQueue(int item) {
		if (isFull()) {
			System.out.println("Queue is full");
			return;
		} else {
			arr[rear++] = item;
		}
	}

	public int deQueue() {
		int val = 0;
		if (isEmpty()) {
			System.out.println("Queue is empty");
		} else {
			val = arr[font];
			font = font + 1;
		}
		return val;
	}
}

public class ArrayQueue {

	public static void main(String[] args) {
		MyQueue q = new MyQueue();
	//	q.enQueue(10);
		//q.enQueue(20);
		q.enQueue(30);
		q.enQueue(40);
	
		System.out.println(q.deQueue());
		System.out.println(q.deQueue());
		System.out.println(q.deQueue());
		System.out.println(q.deQueue());
	}
}
