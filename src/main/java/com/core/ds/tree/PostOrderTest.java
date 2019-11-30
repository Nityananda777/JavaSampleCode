package com.core.ds.tree;

import java.util.Stack;

public class PostOrderTest {

	Node root;

	public void postOrderWithoutRecursion() {
		Stack<Node> s1 = new Stack<Node>();
		Stack<Node> s2 = new Stack<Node>();
		if (root != null) {
			s1.push(root);
			while (!s1.isEmpty()) {
				root = s1.pop();
				s2.push(root);
				if (root.left != null) {
					s1.push(root.left);
				}
				if (root.right != null) {
					s1.push(root.right);
				}
			}

		}
		while (!s2.isEmpty()) {
			root = s2.pop();
			System.out.println(root.data);
		}
	}

	public static void main(String args[]) {
		PostOrderTest tree = new PostOrderTest();
		tree.root = new Node(1);
		tree.root.left = new Node(2);
		tree.root.right = new Node(3);
		tree.root.left.left = new Node(4);
		tree.root.left.right = new Node(5);
		tree.root.right.left = new Node(6);
		tree.root.right.right = new Node(7);
		// tree.iterativePreorder();
		tree.postOrderWithoutRecursion();
	}
}
