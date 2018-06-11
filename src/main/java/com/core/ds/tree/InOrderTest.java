package com.core.ds.tree;

import java.util.Stack;

class Node {

	int data;
	Node left, right;

	Node(int item) {
		data = item;
		left = right = null;
	}
}

public class InOrderTest {

	Node1 root;

	public void inOrderWithoutRecursion() {
		if (root == null) {
			return;
		}
		Stack<Node1> s = new Stack<Node1>();
		while (true) {
			if (root != null) {
				s.push(root);
				root = root.left;
			} else {
				if (s.isEmpty()) {
					break;
				}
				root = s.pop();
				System.out.println(root.data);
				root = root.right;
			}
		}
	}

	public static void main(String args[]) {
		InOrderTest tree = new InOrderTest();
		tree.root = new Node1(1);
		tree.root.left = new Node1(2);
		tree.root.right = new Node1(3);
		tree.root.left.left = new Node1(4);
		tree.root.left.right = new Node1(5);
		tree.root.right.left = new Node1(6);
		tree.root.right.right = new Node1(7);
		// tree.iterativePreorder();
		tree.inOrderWithoutRecursion();
	}
}
