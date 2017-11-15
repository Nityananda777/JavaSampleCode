package com.core.ds;

class LinkedList<T> {
	Node<T> head;
	Node<T> tail;
	Node<T> temp;

	public void addFirst(T data) {
		Node<T> newNode = new Node<T>(data);
		if (head == null) {
			head = newNode;
			tail = newNode;
		} else {
			Node<T> temps = head;
			head=newNode;
			head.setNext(temps);
		}
	}

	public void addLast(T data) {
		Node<T> newNode = new Node<T>(data);
		if (tail.getNext() == null) {
			tail.setNext(newNode);
			tail = newNode;
		}
	}

	public void add(T data) {
		Node<T> newNode = new Node<T>(data);
		if (head == null) {
			head = newNode;
			tail = newNode;
		} else {
			tail.setNext(newNode);
			tail = newNode;
		}
	}

	public void updateSpecificNode(T oldData, T newData) {
		Node<T> newNode = new Node<T>(oldData);
		Node<T> refNode = head;
		while (true) {
			if (refNode == null) {
				head = newNode;
				tail = newNode;
				break;
			} else if (refNode.getData().equals(oldData)) {
				refNode.setData(newData);
				tail = refNode;
				break;
			} else {
				refNode = refNode.getNext();
			}
		}
	}

	public void removeFirst(T data) {
		head = head.getNext();
	}

	public void removeLast(T data) {
		Node<T> refNode = head;
		Node<T> temp;
		while (true) {
			if (refNode.getNext() == null) {
				temp = refNode;
				refNode.setData(null);
				temp = null;
				break;
			} else {
				temp = refNode;
				refNode = refNode.getNext();
			}
		}
	}

	public void removeAfter(Node<T> node) {

	}

	public void removeSpecific(Node<T> node) {

	}

	public void traverse() {
		Node<T> temp = head;
		while (true) {
			if (temp != null) {
				System.out.println(temp.getData());
				temp = temp.getNext();
			}
		}
	}

	static class Node<T> {
		Node<T> next;
		T data;

		Node(T data) {
			this.data = data;
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
}

public class Test {
	public static void main(String[] args) {
		LinkedList<String> list = new LinkedList<String>();
		list.addFirst("10");
		list.addFirst("29");
		list.addFirst("26");
		list.addLast("20");
		list.addLast("54");
		list.addFirst("17");
		// list.traverse();

		// System.out.println("before Traverse...");
		list.updateSpecificNode("20", "100");
		// System.out.println("After Traverse....");
		list.removeLast("54");
		list.traverse();

	}
}