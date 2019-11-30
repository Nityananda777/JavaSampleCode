package com.core.ds.recursion.stack;

class Node {
	private int data;
	private Node next;
	private Node head;
	private Node tail;

	Node(int data) {
		this.data = data;
	}

	public int getData() {
		return data;
	}

	public void setData(int data) {
		this.data = data;
	}

	public Node getNext() {
		return next;
	}

	public void setNext(Node next) {
		this.next = next;
	}

	public void add(int data) {
		Node newNode = new Node(data);
		if (head == null) {
			head = newNode;
			tail = newNode;
		} else {
			tail.setNext(newNode);
			tail = newNode;
		}
	}

	public void traverse() {
		Node current = head;
		while (current != null) {
			System.out.println(current.getData());
			current = current.getNext();
		}
	}

	public void reverse() {
		Node prev = null;
		Node next = null;
		Node current = head;
		while (current != null) {
			next = current.getNext();
			current.setNext(prev);
			prev = current;
			current = next;
		}
		head = prev;
	}
}

public class StackUsingLinkedList {

	int top = -1;
	Node node;
	Node head;
	int data;

	// Returns top of stack
	StackUsingLinkedList(int data) {
		node = new Node(data);
	}

	// Returns true if Stack is empty else false
	boolean isEmpty() {
		if (top == -1) {
			System.out.println("Stack is empty");
			return true;
		}
		return false;
	}

	void push(int val) {
		node.add(val);
	}

	// Removes the top element
	void pop() {
		node.reverse();
		node.traverse();
	}

	// Driver program to test above methods
	public static void main(String[] args) {
		StackUsingLinkedList s = new StackUsingLinkedList(5);
		s.push(10);
		s.push(20);
		s.push(25);
		s.push(40);
		s.push(50);
		s.push(30);
		s.pop();
	
	}
}