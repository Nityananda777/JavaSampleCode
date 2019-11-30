package com.core.ds.recursion.basic.linkedlist;

//Linked List node
class NodeN {
	String data;
	NodeN next;

	NodeN(String d) {
		data = d;
		next = null;
	}
}

public class LinkedListPalindrome {
	NodeN head;

	// A utility function to check if str is palindrome
	// or not
	boolean isPalidromeUtil(String str) {
		int length = str.length();

		// Match characters from beginning and
		// end.
		for (int i = 0; i < length; i++)
			if (str.charAt(i) != str.charAt(length - i - 1))
				return false;

		return true;
	}

	// Returns true if string formed by linked
	// list is palindrome
	boolean isPalindrome() {
		NodeN node = head;

		// Append all nodes to form a string
		String str = "";
		while (node != null) {
			str = str.concat(node.data);
			node = node.next;
		}

		// Check if the formed string is palindrome
		return isPalidromeUtil(str);
	}

	/* Driver program to test above function */
	public static void main(String[] args) {
		LinkedListPalindrome list = new LinkedListPalindrome();
		list.head = new NodeN("a");
		list.head.next = new NodeN("b");
		list.head.next.next = new NodeN("d");
		list.head.next.next.next = new NodeN("cb");
		list.head.next.next.next.next = new NodeN("a");

		System.out.println(list.isPalindrome());

	}
}
// This code has been contributed by Amit Khandelwal
