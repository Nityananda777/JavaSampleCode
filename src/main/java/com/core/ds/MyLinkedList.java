package com.core.ds;

class CustomLinkedList<T> {
	Node<T> head;
	Node<T> tail;
	Node<T> temp;

	CustomLinkedList() {
		head = null;
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
	// public void add(T data) {
	// Node<T> newNode = new Node<T>(data);
	// if (head == null) {
	// head = newNode;
	// tail = newNode;
	// } else {
	// temp = head;
	// head = newNode;
	// newNode.setNext(temp);
	// tail=newNode;
	// }
	// }

	public void addFirst(T data) {
		Node<T> newNode = new Node<T>(data);

		Node<T> temp = head;
		head = newNode;
		head.setNext(temp);

	}

	public void addLast(T data) {
		Node<T> newNode = new Node<T>(data);
		tail.setNext(newNode);
		tail = newNode;

	}

	public void removeFirst(T data) {
		head = head.getNext();
	}

	public void removeLast(T data) {
		Node<T> refHead = head;
		while (true) {
			if (refHead == null) {
				break;
			} else if (refHead.getNext() == null) {
				refHead = temp;
				refHead.setNext(null);
				temp = null; 
				break;
			} else {
				temp = refHead;
				refHead = refHead.getNext();
			}

		}

	}

	public void updateParticularNode(T oldData, T newData) {
		Node<T> refHead = head;
		while (true) {
			if (refHead == null) {
				Node<T> newNode = new Node<T>(oldData);
				tail.setNext(newNode);
				tail = newNode;
				break;
			} else if (refHead.getData().equals(oldData)) {
				refHead.setData(newData);

				refHead = refHead.getNext();
				break;
			} else {
				refHead = refHead.getNext();
			}
		}
	}

	public void traverse() {
		Node<T> temp = head;
		while (true) {
			if (temp != null) {
				System.out.println(temp.getData().toString());
				temp = temp.getNext();
			}
		}
	}

	public Node<T> delete(Node<T> node) {
		return node;

	}

	static public class Node<T> {
		T data;
		Node<T> next;

		Node(T data) {
			this.data = data;
		}

		public T getData() {
			return data;
		}

		public void setData(T data) {
			this.data = data;
		}

		public Node<T> getNext() {
			return next;
		}

		public void setNext(Node<T> next) {
			this.next = next;
		}

		public void displayData() {
			System.out.println("data " + data);
		}
	}
}

public class MyLinkedList {
	public static void main(String[] args) {
		CustomLinkedList<String> sl = new CustomLinkedList<String>();
		sl.add("3");
		sl.add("32");
		sl.add("112");
		sl.addFirst("89");
		// // sl.addFirst(104);
		// // sl.addAfterPerticularNode(54, 32);
		// sl.add(46);
		// sl.add(146);
		// sl.addFirst(78);
		// sl.addAfterPerticularNode(100, 3);
		// sl.addAfterPerticularNode(200,5);
		// sl.updatePerticularNodeValue("189","101");
		// sl.deleteFirstNode();
		// sl.deleteAfter(3);
		// sl.deleteAfter(76);
		// System.out.println("Before Deletion");
		// System.out.println("After Deletion");
		// sl.deleteAll();
		// sl.addLast(555);
		// System.out.println("before delete");
		// sl.traverse();
		// System.out.println("after delete");
		// sl.removeLast("89");
		sl.traverse();
	}
}
