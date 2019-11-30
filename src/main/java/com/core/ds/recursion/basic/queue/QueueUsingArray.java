package com.core.ds.recursion.basic.queue;

public class QueueUsingArray {

	int size=5;
	int[] queue = new int[size];
	int font=0;
	int rear = -1;

	public boolean isFull() {
		if (rear== size) {
			return true;
		}
		return false;
	}

	public boolean isEmpty() {
		if (font == rear+1) {
			return true;
		}
		return false;
	}

	public void enQueue(int item) {
		if (!isFull()) {
			queue[++rear] = item;
		
		}
	}

	public int deQueue() {
		int val = 0;
		if (!isEmpty()) {
			val = queue[font];
			font++;
		}
		return val;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		QueueUsingArray s = new QueueUsingArray();
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
