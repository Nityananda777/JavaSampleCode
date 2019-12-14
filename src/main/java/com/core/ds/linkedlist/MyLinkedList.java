package com.core.ds.linkedlist;

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

	public void addNode(T data, int position) {
		int count = 0;
		Node<T> prev = null;
		Node<T> temp = null;
		Node<T> current = head;
		Node<T> newNode = new Node<T>(data);
		while (current != null) {
			if (prev == null) {
				prev = head;
				if (count == position) {
					head = newNode;
					head.setNext(prev);
				}
			} else if (count == position) {
				temp = prev.getNext();
				prev.setNext(newNode);
				newNode.setNext(temp);
				break;
			} else {
				prev = current;
				current = current.getNext();
			}
			++count;
			System.out.println("count is " + count);
		}

	}

	public void deleteNode(int position) {
		int count = 0;
		Node<T> prev = null;
		Node<T> current = head;
		if (count == position) {
			head = head.getNext();
		}
		while (current != null) {
			if (count == position) {
				prev.setNext(current.getNext());
				break;
			} else {
				prev = current;
				current = current.getNext();
			}
			++count;
			System.out.println("delete count is " + count);
		}
	}

	public void deleteNode(T data) {
		int count = 0;
		Node<T> prev = head;
		Node<T> current = head.getNext();
		if (head.getData() == data) {
			head = head.getNext();
		}
		while (current != null) {
			if (current.getData() == data) {
				prev.setNext(current.getNext());
				break;
			} else {
				prev = prev.getNext();
				current = current.getNext();
			}
			++count;
			System.out.println("count is " + count);
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
		// sl.addNode("10", 0);
		// sl.traverse();
		System.out.println("After delete");
		//sl.deleteNode(1);
		sl.traverse();
	}
}
