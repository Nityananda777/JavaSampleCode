package com.core.ds;

public class DoubleLinkedList<T> {
	T data;
	Node<T> head;
	Node<T> tail;
	Node<T> temp;

	public void addAtEnd(T data) {
		Node newNode = new Node(data);
		if (head == null) {
			head = newNode;
			tail = newNode;
		} else {
			tail.setNext(newNode);
			newNode.setPrev(tail);
			tail = newNode;
			/*if (tail.getNext() == null) {
				tail.setNext(head);
			}*/
		}

	}
	public void addAtStart(T data) {
		Node newNode = new Node(data);
		if (head == null) {
			head = newNode;
			tail = newNode;
		} else {
			newNode.setNext(head);
			head.setPrev(newNode);
			head = newNode;
			/*if (tail.getNext() == null) {
				tail.setNext(head);
			}*/
		}

	}

	public void traverse() {
		temp = head;
		while (temp.getNext() != null) {
			System.out.println(temp.getData());
			temp = temp.getNext();
		}
	}

	public void traverseReverse() {
		Node current = tail;
		while (current != null) {
			System.out.println(current.getData());
			current = current.getPrev();
		}
	}

	public void traverseReverse1() {
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
		traverse();
	}
	 public Node deleteDuplicates() {
	        if(head == null || head.next == null)
	            return head;
	        Node p = head;
	 
	        while( p!= null && p.next != null){
	            if(p.getData() == p.next.getData()){
	                p.next = p.next.next;
	            }else{
	                p = p.next; 
	            }
	        }
	 
	        return head;
	    }
	public boolean isCyclics() {
		Node current = head;
		while (current != null) {
			if (current.getNext() == head) {
				return true;
			}
			current = current.getNext();
		}
		return false;
	}

	public Node findMiddleElement() {
		Node first = head;
		Node second = head;
		while (first != null) {
			first = first.getNext();
			if (first != null && first.getNext() != null) {
				first = first.getNext();
				second = second.getNext();
			}
		}
		return second;
	}
	 public Node findMiddleNode()
	 {
	 Node slowPointer, fastPointer; 
	  slowPointer = fastPointer = head; 

	  while(fastPointer !=null) { 
	   fastPointer = fastPointer.next; 
	   if(fastPointer != null && fastPointer.next != null) { 
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
		d.addAtStart("12");
		d.addAtStart("11");
		d.addAtStart("14");
		d.addAtStart("15");
		d.addAtStart("16");
		d.addAtStart("17");
		
		d.addAtStart("19");
		d.addAtStart("19");
		// d.traverse();
		// d.traverseReverse();
		// System.out.println(d.isCyclics());
		//System.out.println(d.findMiddleElement().getData());
		System.out.println(d.deleteDuplicates());
		d.traverse();
}
}