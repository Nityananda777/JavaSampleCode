package com.core.ds.recursion.linkedlist;

public class QueueDoubleLinkedList<T> {

	int size = 0;
	Node<T> rear, font = null;

	public boolean isEmpty() {
		return (size == 0);
	}

	public void enQueue(T data) {
		Node<T> newNode = new Node<T>(data);
		if (isEmpty()) {
			rear = newNode;
			font = newNode;
			size++;
		} else {
			font.setNext(newNode);
			newNode.setPrev(font);
			font = newNode;
			size++;
		}
	}

	public T deQueue() {
		Node<T> newNode = null;
		if (!isEmpty()) {
			newNode = new Node<T>(rear.getData());
			rear = rear.getNext();
		}
		return newNode.getData();
	}

	class Node<T> {
		Node<T> next;
		Node<T> prev;
		T data;

		Node(T d) {
			this.data = d;
		}

		public Node<T> getPrev() {
			return prev;
		}

		public void setPrev(Node<T> prev) {
			this.prev = prev;
		}

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
		QueueDoubleLinkedList<String> t = new QueueDoubleLinkedList<String>();
		t.enQueue("10");
		t.enQueue("20");
		t.enQueue("30");
		t.enQueue("40");
		t.enQueue("50");
		System.out.println(t.deQueue());
		System.out.println(t.deQueue());
		System.out.println(t.deQueue());
		System.out.println(t.deQueue());
		System.out.println(t.deQueue());
	}

}
