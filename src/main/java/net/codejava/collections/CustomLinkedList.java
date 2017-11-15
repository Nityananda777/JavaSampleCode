package net.codejava.collections;

class MyLinkedList {

	Node head;

	MyLinkedList() {
		head = new Node("head");
	}

	public void addNode(Node node) {
		Node current = head;
		while (current.next != null) {
			current = current.next;
		}
		current.setNext(node);
	}

	public String toString() {
		StringBuilder sb = new StringBuilder();
		Node current = head.getNext();
		while (current != null) {
			sb.append(current).append("-->");
			current = current.getNext();
		}
		sb.delete(sb.length() - 3, sb.length()); // to remove --> from last node
		return sb.toString();
	}

	static class Node {
		String data;
		Node next;

		public String getData() {
			return data;
		}

		public void setData(String data) {
			this.data = data;
		}

		public Node getNext() {
			return next;
		}

		public void setNext(Node next) {
			this.next = next;
		}

		Node(String data) {
			this.data = data;
		}
	}
}

public class CustomLinkedList {

	public static void main(String[] args) {
		MyLinkedList list = new MyLinkedList();
		list.addNode(new MyLinkedList.Node("Node1"));
		list.addNode(new MyLinkedList.Node("Node2"));
		list.addNode(new MyLinkedList.Node("Node3"));
		list.addNode(new MyLinkedList.Node("Node4"));
		list.addNode(new MyLinkedList.Node("Node5"));
		System.out.println(list);
	}
}
