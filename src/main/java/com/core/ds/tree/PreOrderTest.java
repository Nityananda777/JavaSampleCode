package com.core.ds.tree;

import java.util.Stack;

class Node1 {

	int data;
	Node1 left, right;

	Node1(int item) {
		data = item;
		left = right = null;
	}
}

public class PreOrderTest {

	Node1 root;

	void iterativePreorder() {
		iterativePreorder(root);
	}

	// An iterative process to print preorder traversal of Binary tree
	void iterativePreorder(Node1 root) {
		if (root == null)
			return;

		Stack<Node1> s = new Stack<Node1>();
		s.push(root);

		while (!s.isEmpty()) {
			root = s.pop();
			System.out.println(root.data);
			if (root.right != null) {
				s.push(root.right);
			}
			if (root.left != null) {
				s.push(root.left);
			}
		}
	}

	void printPreorder(Node1 node) {
		if (node == null) {
			return;
		}
		System.out.print("," + node.data);
		printPreorder(node.left);
		printPreorder(node.right);

	}

	void printInorder(Node1 node) {
		if (node == null) {
			return;
		}
		printPreorder(node.left);
		System.out.print(node.data);
		printPreorder(node.right);
	}

	void printPostorder(Node1 node) {
		if (node == null) {
			return;
		}
		printPreorder(node.left);
		printPreorder(node.right);
		System.out.print(node.data);
	}

	// driver program to test above functions
	public static void main(String args[]) {
		PreOrderTest tree = new PreOrderTest();
		tree.root = new Node1(10);
		tree.root.left = new Node1(8);
		tree.root.right = new Node1(2);
		tree.root.left.left = new Node1(3);
		tree.root.left.right = new Node1(5);
		tree.root.right.left = new Node1(4);
		tree.root.right.right = new Node1(7);
		tree.iterativePreorder();
		// tree.printPreorder(tree.root);
		// tree.printInorder(tree.root);
	}
}
