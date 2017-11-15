package com.core.ds;

class MLinkedList<T> {
	Node<T> head;
	Node<T> tail;
	Node<T> temp;

	MLinkedList() {
	}

	public void add(T data) {

	}

	public void addFirst(T data) {
		Node<T> newNode = new Node<T>(data);
		if (head == null) {
			head = newNode;
			tail = newNode;
		} else {
			temp = head;
			head = newNode;
			newNode.next = temp;
		}

	}

	public void addLast(T data) {
		Node<T> newNode = new Node<T>(data);
		if (head == null) {
			head = newNode;
			tail = newNode;
		} else {
			tail.next = newNode;
			tail = newNode;
			tail.next = head;
		}
	}

	public void remove() {

	}

	public void removeFirst() {
		head = head.next;

	}

	public void removeLast() throws Exception {
		Node<T> refNode = head;
		while (true) {
			if (refNode == null) {
				throw new Exception();
			} else if (refNode.next == null) {
				refNode = temp;
				refNode.next = null;
				tail = refNode;
				break;
			} else {
				temp = refNode;
				refNode = refNode.next;
			}
		}
	}

	public void traverse() {
		temp = head;
		while (true) {
			if (temp != null) {
				System.out.println(temp.data);
				temp = temp.next;
			}
		}
	}

	public void reverse(Node<T> curr) {
		Node<T> prev = null;
		Node<T> next;
		while (curr != null) {
			next = curr.next;
			curr.next = prev;
			prev = curr;
			curr = next;
		}
	}

	public boolean isCyclic() {
		boolean flag = false;
		temp = head;
		while (temp == tail.next) {
			flag = true;
			temp = temp.next;
		}
		return flag;
	}

	public void push(T data) {
		addLast(data);
	}

	public void pop() {
		removeFirst();
	}

	class Node<T> {
		T data;
		Node<T> next;

		Node(T data) {
			this.data = data;
		}
	}

}

public class MyTest {

	public static void main(String[] args) throws Exception {
		MLinkedList l = new MLinkedList();
		/*
		 * l.addFirst(12); l.addFirst(1); l.addFirst(3); l.addFirst(2);
		 * l.traverse();
		 */
		System.out.println(".........");
		l.addLast(5);
		l.addLast(10);
		l.addLast(12);
		l.addLast(13);
		// l.traverse();
		System.out.println(l.isCyclic());
	}
}
