package com.core.ds.recursion.basic.tree;

import java.util.Stack;

public class LevelOrderTest {

	Node root;
	public void levelOrderWithoutRecursion() {
		Stack stack1 = new Stack<>();
		Stack stack2 = new Stack<>();
		stack1.push(root);
		while (!stack1.isEmpty()) {
			Node temp = (Node) stack1.pop();
			stack2.push(temp);
			if (temp.left != null) {
				stack1.push(temp.left);
			}
			if (temp.right != null) {
				stack1.push(temp.right);
			}
		}
		while (!stack2.isEmpty()) {
			Node temp1=(Node) stack2.pop();
			System.out.println(temp1.data);
		}

	}

	public static void main(String args[]) {
		LevelOrderTest tree = new LevelOrderTest();
		tree.root = new Node(1);
		tree.root.left = new Node(2);
		tree.root.right = new Node(3);
		tree.root.left.left = new Node(4);
		tree.root.left.right = new Node(5);
		tree.root.right.left = new Node(6);
		tree.root.right.right = new Node(7);
		// tree.iterativePreorder();
		//tree.postOrderWithoutRecursion();
	}
}
