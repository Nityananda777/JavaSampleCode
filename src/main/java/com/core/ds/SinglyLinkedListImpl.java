package com.core.ds;

public class SinglyLinkedListImpl<T> {

	private Node<T> head;
	private Node<T> tail;
	private Node<T> temp;

	public void add(T element) {
		Node<T> nd = new Node<T>(element, null);
		// nd.setValue(element);
		System.out.println("Adding: " + element);
		/**
		 * check if the list is empty
		 */
		if (head == null) {
			// since there is only one element, both head and
			// tail points to the same object.
			head = nd;
			tail = nd;
		} else {
			// set current tail next link to new node
			tail.setNextRef(nd);
			// set tail as newly created node
			tail = nd;
			/*
			 * if (tail.getNextRef() == null) { tail.setNextRef(head); }
			 */
		}
	}

	public void addFirst(T element) {

		Node<T> newNode = new Node<T>(element, null);
		System.out.println("Adding Element to FirstPosition : " + element);
		Node<T> temp = head;
		head = newNode;
		head.setNextRef(temp);

	}

	public void addAfterPerticularNode(T element, T afterElement) {

		Node<T> referenceElement = head;
		Node<T> temp;

		while (true) {
			if (referenceElement == null) {
				System.out.println(afterElement + " NodeValue NotFound::adding as latElement");
				Node<T> newNode = new Node<T>(element, null);
				tail.setNextRef(newNode);
				tail = newNode;
				break;
			}
			// for adding a new node @ given position
			if (referenceElement.getValue().toString().equals(afterElement.toString())) {
				System.out.println(" Adding  " + element + " after  " + afterElement);
				Node<T> newNode = new Node<T>(element, null);
				temp = referenceElement.getNextRef();
				referenceElement.setNextRef(newNode);
				newNode.setNextRef(temp);
				// tail = newNode;
				// tail.setNextRef(temp);
				// referenceElement = referenceElement.getNextRef();
				break;
			} else {

				referenceElement = referenceElement.getNextRef();
			}

		}

	}

	public void updatePerticularNodeValue(T updatedValue, T existingValue) {

		Node<T> referenceElement = head;
		Node<T> temp;

		while (true) {
			if (referenceElement == null) {
				System.out.println(existingValue + " NodeValue NotFound::adding as latElement");
				Node<T> newNode = new Node<T>(updatedValue, null);
				tail.setNextRef(newNode);
				tail = newNode;
				break;
			}
			// for updating a particular node value
			if (referenceElement.getValue().toString().equals(existingValue.toString())) {
				System.out.println(" updating  " + existingValue + " NodeValue  ");
				referenceElement.setValue(updatedValue);
				referenceElement = referenceElement.getNextRef();
				break;
			} else {

				referenceElement = referenceElement.getNextRef();
			}

		}

	}

	public void addLast(T element) {

		Node<T> newNode = new Node<T>(element, null);
		tail.setNextRef(newNode);
		tail = newNode;
	}

	public void deleteNode(Node list, String str) {
		Node temp = list;
		Node prev = list;

		while (temp.getNextRef() != null) {
			if (temp.getValue().equals(str)) {
				if (prev.getNextRef() == null)
					prev.setNextRef(null);
				else {
					prev.setNextRef(prev.getNextRef().getNextRef());
				}

			}
			prev = temp;
			temp = temp.getNextRef();
		}
	}

	public void deleteNodePosition(int position) {
		if (head == null) {

		} else if (position == 0) {
			head = head.getNextRef();
		} else {
			Node temp = head;
			for (int i = 0; i < position; i++) {
				temp = temp.getNextRef();
			}
			temp.setNextRef(temp.getNextRef().getNextRef());

		}
	}

	public void deleteLast() {

		Node<T> referenceElement = head;
		while (true) {
			if (referenceElement == null) {
				break;
			}
			// for updating a particular node value
			if (referenceElement.getNextRef() == null) {
				referenceElement = temp;
				referenceElement.setNextRef(null);
				temp = null;
				break;
			} else {
				temp = referenceElement;
				referenceElement = referenceElement.getNextRef();
			}

		}

	}

	public void deleteAll() {

		head = null;
	}

	public void deleteFirstNode() {

		System.out.println("deleting " + head.getValue());
		head = head.getNextRef();

	}

	public void deleteAfter(T afterElement) {

		Node<T> referenceElement = head;
		Node<T> nextrefofSelected;
		Node<T> nextTonextref;
		while (true) {
			if (referenceElement == null) {
				break;
			}
			// for updating a particular node value
			if (referenceElement.getValue().toString().equals(afterElement.toString())) {
				System.out.println(" deleting  element after " + afterElement + " NodeValue  ");
				// referenceElement.setValue(updatedValue);
				nextrefofSelected = referenceElement.getNextRef();
				nextTonextref = nextrefofSelected.getNextRef();
				referenceElement.setNextRef(nextTonextref);
				referenceElement = referenceElement.getNextRef();
				break;
			} else {
				referenceElement = referenceElement.getNextRef();
			}

		}

	}

	public void traverse() {

		Node<T> tmp = head;
		while (true) {
			if (tmp == null) {
				System.out.println();
				break;
			}
			System.out.println(tmp.getValue());
			tmp = tmp.getNextRef();
		}
	}

	public void reverse() {
		Node<T> next = null;
		Node<T> prev = null;
		Node<T> current = head;
		while (current != null) {
			next = current.getNextRef();
			current.setNextRef(prev);
			prev = current;
			current = next;

		}
		head = prev;
		traverse();
	}

	public void lengthOfLinkedList() {
		Node temp = head;
		int counter = 0;
		while (temp != null) {
			System.out.println(temp.getValue());
			counter++;
			temp = temp.getNextRef();
		}
		System.out.println("length is " + counter);
	}

	public boolean isCyclic() {
		boolean isCyclic = false;
		Node current = head;
		while (current != null) {
			if (current.getNextRef() == head) {
				isCyclic = true;
				break;
			}
			current = current.getNextRef();
		}
		return isCyclic;
	}

	public boolean isPalindrome(Node node) {
		boolean isPalindrome = false;
		Node current = head;
		int reverse = 0;
		int reminder = 0;
		Integer num = (Integer) node.getValue();
		while (current.getNextRef() != null) {
			reminder = num % 10;
			reverse = reverse * 10 + reminder;
			num = num / 10;
		}
		// Node next = head.getNextRef();
		if (num == reverse) {
			isPalindrome = true;
		}
		return isPalindrome;
	}

	public Node nthFromLastNode(int n) {
		Node firstPtr = head;
		Node secondPtr = head;
		for (int i = 0; i < n; i++) {
			firstPtr = firstPtr.getNextRef();
		}
		while (firstPtr != null) {
			firstPtr = firstPtr.getNextRef();
			secondPtr = secondPtr.getNextRef();
		}

		return secondPtr;
	}

	public void removeDuplicate() {
		Node temp = head;
		while (temp.getNextRef()!= null) {
			if (temp.nextRef.value==temp.value) {
				temp.nextRef = temp.nextRef.nextRef;
			} else {
				temp = temp.nextRef;
			}
		}
	}

	public static void main(String a[]) {
		SinglyLinkedListImpl<Integer> sl = new SinglyLinkedListImpl<Integer>();
		sl.add(10);
		sl.add(12);
		sl.add(13);
		sl.add(14);
		sl.add(15);
		sl.add(15);

	;
		// sl.addFirst(89);
		// // sl.addFirst(104);
		// // sl.addAfterPerticularNode(54, 32);
		sl.add(16);
		System.out.println("is cyclic " + sl.isCyclic());
		Node nthNodeFromLast = sl.nthFromLastNode(3);
		System.out.println("3th node from end is : " + nthNodeFromLast.getValue());
		// sl.add(146);
		// sl.addFirst(78);
		// sl.addAfterPerticularNode(100, 3);
		// sl.addAfterPerticularNode(200,5);
		// sl.updatePerticularNodeValue(189, 101);
		// sl.deleteFirstNode();
		// sl.deleteAfter(3);
		// sl.deleteAfter(76);
		// System.out.println("Before Deletion");
		// System.out.println("After Deletion");
		// sl.deleteAll();
		// sl.addLast(555);
		// System.out.println("before delete");
		// sl.traverse();
		System.out.println("After reverse");
		sl.deleteNodePosition(2);
		sl.removeDuplicate();
		sl.traverse();
		// sl.deleteLast();
		// System.out.println("after delete");
		// sl.reverse();
		// sl.lengthOfLinkedList();

	}
}

class Node<T> implements Comparable<T> {

	T value;
	Node<T> nextRef;

	public Node(T value, Node<T> value1) {
		this.value = value;
		this.nextRef = value1;
	}

	public T getValue() {
		return value;
	}

	public void setValue(T value) {
		this.value = value;
	}

	public Node<T> getNextRef() {
		return nextRef;
	}

	public void setNextRef(Node<T> ref) {
		this.nextRef = ref;
	}

	@Override
	public int compareTo(T arg) {
		if (arg == this.value) {
			return 0;
		} else {
			return 1;
		}
	}
}
