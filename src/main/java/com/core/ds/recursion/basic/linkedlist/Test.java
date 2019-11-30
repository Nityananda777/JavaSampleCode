package com.core.ds.recursion.basic.linkedlist;

class Nodes<T> {
	Nodes<T> next;
	int data;

	Nodes(int datas) {
		this.data = datas;
	}

}

class Linkedlist {
	Nodes head;
	Nodes tail;

	public void push(int data) {
		Nodes newNode = new Nodes(data);
		if (head == null) {
			head = newNode;
			tail = newNode;
		} else {
			tail.next = newNode;
			tail = newNode;
		}
	}

	public void intersect(Nodes node1, Nodes node2) {
		Nodes temp1 = node1;
		int tem2Data = node2.data;
		if (isPresent(temp1, tem2Data)) {
			push(tem2Data);
			temp1 = temp1.next;
		}

	}

	public void union(Nodes node1, Nodes node2) {
		Nodes temp1 = node1;
		int tem2Data = node2.data;
		if (!isPresent(temp1, tem2Data)) {
			push(tem2Data);
			temp1 = temp1.next;
		}
	}

	public boolean isPresent(Nodes node, int data) {
		boolean flag = false;
		while (node != null) {
			if (node.data == data)
				flag = true;
			else
				flag = false;
			node = node.next;
		}
		return flag;
	}

	void printList() {
		Nodes temp = head;
		while (temp != null) {
			System.out.print(temp.data + " ");
			temp = temp.next;
		}
		System.out.println();
	}

}

public class Test {
	public static void main(String[] args) {
		Linkedlist l1 = new Linkedlist();
		Linkedlist l2 = new Linkedlist();
		Linkedlist l3 = new Linkedlist();
		l1.push(10);
		l1.push(20);
		l1.push(30);
		l1.push(40);
		l1.push(50);

		l2.push(5);
		l2.push(2);
		l2.push(30);
		l2.push(4);
		l2.push(5);
		l1.intersect(l1.head, l2.head);
		l1.printList();
	}
}
