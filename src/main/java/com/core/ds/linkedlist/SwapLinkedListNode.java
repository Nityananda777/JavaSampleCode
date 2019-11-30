package com.core.ds.linkedlist;

public class SwapLinkedListNode<T> {
	NodeF currentX;
	NodeF currentY;
	NodeF prevX;
	NodeF prevY;
	NodeF temp;
	NodeF head;
	NodeF tail;

	public void addAtEnd(T data) {
		NodeF n = new NodeF(data);
		if (head == null) {
			n = head;
			n = tail;
		} else {
			tail.setNextRef(n);
			tail = n;
		}
	}

	public void traverse() {

		NodeF<T> tmp = head;
		while (true) {
			if (tmp == null) {
				System.out.println();
				break;
			}
			System.out.println(tmp.getValue());
			tmp = tmp.getNextRef();
		}
	}

	public void swapNode(T x, T y) {
		if (currentX == null || currentY == null) {
			return;
		}
		if (currentX.getValue() == null || currentY.getValue() == null) {
			return;
		}
		if (currentX != null && currentX.getValue() != x) {
			prevX = currentX;
			currentX = currentX.getNextRef();
		}
		if (currentY != null && currentY.getValue() != y) {
			prevY = currentY;
			currentY = currentY.getNextRef();
		}
		if (prevX == null) {
			head = currentX;
		} else {
			prevX.setNextRef(currentY);
		}
		if (prevY == null) {
			head = currentY;
		} else {
			prevY.setNextRef(currentX);
		}
		// Swap
		temp = currentY.getNextRef();
		currentY.setNextRef(currentX.getNextRef());
		currentX.setNextRef(temp);
	}

	public static void main(String[] args) {
		SwapLinkedListNode s = new SwapLinkedListNode();
		s.addAtEnd(10);
		s.addAtEnd(20);
		s.addAtEnd(30);
		s.addAtEnd(40);
		s.addAtEnd(50);
		s.addAtEnd(60);
		s.traverse();
	}
}

class NodeF<T> implements Comparable<T> {

	T value;
	NodeF<T> nextRef;

	public NodeF(T value) {
		this.value = value;
	}

	public T getValue() {
		return value;
	}

	public void setValue(T value) {
		this.value = value;
	}

	public NodeF<T> getNextRef() {
		return nextRef;
	}

	public void setNextRef(NodeF<T> ref) {
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
