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
	void iterativePreorder(Node1 node) {
		if (node == null) {
			return;
		}
		Stack<Node1> nodeStack = new Stack<Node1>();
		nodeStack.push(root);
		while (nodeStack.empty() == false) {
			Node1 mynode = nodeStack.peek();
			System.out.print(mynode.data + " ");
			nodeStack.pop();
			if (mynode.right != null) {
				nodeStack.push(mynode.right);
			}
			if (mynode.left != null) {
				nodeStack.push(mynode.left);
			}
		}
	}

	void printPreorder(Node1 node) {
		if (node == null) {
			return;
		}
		System.out.print(","+node.data);
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
		// tree.iterativePreorder();
		//tree.printPreorder(tree.root);
		tree.printInorder(tree.root);
	}
}
