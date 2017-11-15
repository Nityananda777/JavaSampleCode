package com.core.ds;

public class MergeLinkedList {
	NodeM head;

	public void addToFront(int data) {
		NodeM n = new NodeM(data);
		n.next = head;
		head = n;
	}

	public void printList() {
		NodeM tmp = head;
		while (tmp != null) {
			System.out.print(tmp.data + " ");
			tmp = tmp.next;
		}
		System.out.println();
	}

	public void mergeList(MergeLinkedList list) {

		if (list == null || list.head == null) {
			return;
		}
		if (head == null) {
			head = list.head;
			return;
		}
		NodeM tmp1 = head;
		NodeM tmp2 = list.head;
		if (tmp1.data < tmp2.data) {
			head = tmp1;
			tmp1 = tmp1.next;
		} else {
			head = tmp2;
			tmp2 = tmp2.next;
		}
		NodeM mergedNext = head;

		while (tmp1 != null && tmp2 != null) {
			if (tmp1.data < tmp2.data) {
				mergedNext.next = tmp1;
				tmp1 = tmp1.next;
			} else {
				mergedNext.next = tmp2;
				tmp2 = tmp2.next;
			}
			mergedNext = mergedNext.next;
		}

		if (tmp1 != null) {
			mergedNext.next = tmp1;
		} else {
			mergedNext.next = tmp2;
		}
	}

	public static void main(String[] args) {
		MergeLinkedList list1 = new MergeLinkedList();
		list1.addToFront(9);
		list1.addToFront(8);
		list1.addToFront(6);
		list1.addToFront(5);
		list1.addToFront(4);
		list1.addToFront(2);

		MergeLinkedList list2 = new MergeLinkedList();
		list2.addToFront(7);
		list2.addToFront(3);
		list2.addToFront(1);

		list1.mergeList(list2);
		System.out.println("Merged List:");
		list1.printList();
	}	
}

class NodeM {
	int data;
	NodeM next;

	public NodeM(int data) {
		this.data = data;
	}
}
