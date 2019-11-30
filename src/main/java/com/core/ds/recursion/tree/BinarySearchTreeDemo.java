package com.core.ds.recursion.tree;

public class BinarySearchTreeDemo {
	Node root;
	Node left;
	Node right;

	class Node {
		int key;
		Node left;
		Node right;

		Node(int key) {
			this.key = key;
		}
	}

	public void insert(int key) {
		root = insertData(root, key);
	}

	public void inOrder(Node root) {
		if (root == null) {
			return;
		}
		inOrder(root.left);
		System.out.println(root.key);
		inOrder(root.right);
	}

	public Node insertData(Node root, int key) {
		if (root == null) {
			root = new Node(key);
			return root;
		} else {
			if (root.key > key) {
				root.left = insertData(root.left, key);
			} else if (root.key < key) {
				root.right = insertData(root.right, key);
			}
		}
		return root;

	}
	public Node insert(Node root, int key) {
		if (root == null) {
			root = new Node(key);
			return root;
		} else {
			if (root.key > key) {
				root.left = insertData(root.left, key);
			} else if (root.key < key) {
				root.right = insertData(root.right, key);
			}
		}
		return root;

	}

	public static void main(String[] args) {
		BinarySearchTreeDemo tree = new BinarySearchTreeDemo();
		tree.insert(10);
		tree.insert(12);
		tree.insert(1);
		tree.insert(5);
		tree.insert(6);
	}
}
