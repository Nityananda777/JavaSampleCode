package com.core.ds;

import java.util.Queue;
import java.util.LinkedList;

public class StackUsingQueue {

	Queue<Integer> q1 = new LinkedList<Integer>();
	Queue<Integer> q2 = new LinkedList<Integer>();
	int size;

	public void push(int item) {
		size = q1.size();
		q1.add(item);
		for (int i = 0; i < size; i++) {
			q2.add(q1.remove());
		}
		for (int i = 0; i < size; i++) {
			q1.add(q2.remove());
		}
	}

	public int pop() {
		int val = 0;
		if (!q1.isEmpty())
			val = q1.remove();
		return val;
	}

	public static void main(String[] args) {
		StackUsingQueue s = new StackUsingQueue();
		s.push(10);
		s.push(11);
		s.push(12);
		s.push(13);
		s.push(14);
		System.out.println(s.pop());
		System.out.println(s.pop());
		System.out.println(s.pop());
		System.out.println(s.pop());
		System.out.println(s.pop());
	}

}
