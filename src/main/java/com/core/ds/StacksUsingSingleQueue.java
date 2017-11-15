package com.core.ds;

import java.util.Queue;
import java.util.LinkedList;

public class StacksUsingSingleQueue {

	int size;
	Queue<Integer> q = new LinkedList<Integer>();

	public void push(int item) {
		size = q.size();
		q.add(item);

		for (int i = 0; i < size; i++) {
			int x = q.remove();
			q.add(x);
		}
	}

	public int pop() {
		int val = 0;
		if (!isEmpty()) {
			val = q.remove();
		}
		return val;
	}

	public boolean isEmpty() {
		return q.isEmpty();
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		StacksUsingSingleQueue s = new StacksUsingSingleQueue();
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
