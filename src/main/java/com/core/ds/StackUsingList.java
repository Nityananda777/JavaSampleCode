package com.core.ds;

public class StackUsingList<T> {

	Node<T> head;
	Node<T> tail;
	Node<T> temp;
	int size;
	T data;

	public boolean isEmpty() {
		return (size == 0);
	}

	public void push(T data) {
		Node<T> newNode = new Node<T>(data);
		if (isEmpty()) {
			head = newNode;
			tail = newNode;
			size++;
		} else {
			tail.setNext(newNode);
			tail = newNode;
			size++;
		}
	}

	public void traverse() {
		Node<T> temp = head;
		while (temp != null) {
			System.out.println(temp.getData());
			temp = temp.getNext();
		}
	}

	public void pop() {
		Node<T> next = null;
		Node<T> prev = null;
		Node<T> current = head;
		while (current != null) {
			next = current.getNext();
			current.setNext(prev);
			prev = current;
			current = next;
		}
		head = prev;
		traverse();
	}

	class Node<T> {
		T data;

		Node(T d) {
			this.data = d;
		}

		Node<T> next;

		public Node<T> getNext() {
			return next;
		}

		public void setNext(Node<T> next) {
			this.next = next;
		}

		public T getData() {
			return data;
		}

		public void setData(T data) {
			this.data = data;
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		StackUsingList<String> s = new StackUsingList();
		s.push("10");
		s.push("11");
		s.push("12");
		s.push("13");
		s.push("14");
		s.push("15");
		s.pop();
		s.pop();
		s.pop();
		s.pop();
		s.pop();
		s.pop();
	}

}
