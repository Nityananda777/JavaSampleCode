
package com.core.ds.linkedlist;

public class DoubleLinkedList<T> {
	T data;
	Node<T> head;
	Node<T> tail;
	Node<T> temp;

	public void addAtEnd(T data) {
		Node<T> newNode = new Node<T>(data);
		if (head == null) {
			head = newNode;
			tail = newNode;
		} else {
			tail.setNext(newNode);
			newNode.setPrev(tail);
			tail = newNode;
			/*
			 * if (tail.getNext() == null) { tail.setNext(head); }
			 */
		}
	}

	public void addAtStart(Node newNode) {
		if (head == null) {
			head = newNode;
			tail = newNode;
		} else {
			newNode.setNext(head);
			head.setPrev(newNode);
			head = newNode;

		}
		/*
		 * // * if (tail.getNext() == null) { tail.setNext(head); } //
		 */
		// }
		//
	}

	/*
	 * public void addAtStart(Node n) { n.next = head; if (head != null) { head.prev
	 * = n; } head = n; if (end == null) end = head; }
	 */

	public void remove(Node n) {
		Node curr = head;
		while (curr.getNext() != null && curr.getData() != n.data) {
			curr = curr.getNext();
		}
		if (curr.prev != null && curr.getData() == n.data) {
			curr.prev.next = curr.next;
		} else {
			head = curr.next;
		}
		if (curr.next != null&& curr.getData() == n.data) {
			curr.next.prev = n.prev;
		}
	}

	public void removeStart() {
		head = head.getNext();

	}

	public void removeEnd() {
		Node<T> refNode = null;
		temp = head;
		while (true) {
			if (temp.getNext() == null) {
				refNode.setNext(null);
				break;
			} else {
				refNode = temp;
				temp = temp.getNext();
			}
		}

	}

	public void traverse() {
		temp = head;
		while (true) {
			if (temp.getNext() != null) {
				System.out.println(temp.getData());
				temp = temp.getNext();
			} else {
				System.out.println(temp.getData());
				break;
			}

		}

	}

	public void traverseReverse() {
		Node<T> current = tail;
		while (current != null) {
			System.out.println(current.getData());
			current = current.getPrev();
		}
	}

	public void traverseReverse1() {
		Node<T> prev = null;
		Node<T> next = null;
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

	public Node<T> deleteDuplicates() {
		if (head == null || head.next == null)
			return head;
		Node<T> p = head;

		while (p != null && p.next != null) {
			if (p.getData() == p.next.getData()) {
				p.next = p.next.next;
			} else {
				p = p.next;
			}
		}

		return head;
	}

	public boolean isCyclics() {
		Node<T> current = head;
		while (current != null) {
			if (current.getNext() == head) {
				return true;
			}
			current = current.getNext();
		}
		return false;
	}

	public Node<T> findMiddleElement() {
		Node<T> first = head;
		Node<T> second = head;
		while (first != null) {
			first = first.getNext();
			if (first != null && first.getNext() != null) {
				first = first.getNext();
				second = second.getNext();
			}
		}
		return second;
	}

	public Node<T> findMiddleNode() {
		Node<T> slowPointer, fastPointer;
		slowPointer = fastPointer = head;

		while (fastPointer != null) {
			fastPointer = fastPointer.next;
			if (fastPointer != null && fastPointer.next != null) {
				slowPointer = slowPointer.next;
				fastPointer = fastPointer.next;
			}
		}

		return slowPointer;

	}

	static public class Node<T> {
		T data;
		Node<T> next;
		Node<T> prev;

		Node(T data) {
			this.data = data;
		}

		public Node<T> getPrev() {
			return prev;
		}

		public void setPrev(Node<T> prev) {
			this.prev = prev;
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

	public static void main(String[] args) {
		DoubleLinkedList<String> d = new DoubleLinkedList<String>();
		d.addAtStart(new Node("12"));
		d.addAtStart(new Node("11"));
		d.addAtStart(new Node("14"));
		d.addAtStart(new Node("15"));
		d.addAtStart(new Node("16"));
		d.addAtStart(new Node("17"));

		d.addAtStart(new Node("19"));
		// d.addAtStart("19");
		// d.traverse();
		// d.traverseReverse();
		// System.out.println(d.isCyclics());
		// System.out.println(d.findMiddleElement().getData());
		// System.out.println(d.deleteDuplicates());
		// d.traverse();
		d.remove(new Node("15"));
		// d.traverseReverse1();
		d.traverse();
		d.traverseReverse();
	}
}