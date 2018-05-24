package com.core.ds.tree;

public class BinarySearchTree {

	class Node {
		Node left;
		Node right;
		int key;

		Node(int key) {
			this.key = key;
		}
	}

	static Node root;

	public void inOrderD() {
		inOder(root);
	}

	public void inOder(Node root) {
		if (root == null) {
			return;
		}
		
		inOder(root.left);
		System.out.println(root.key);
		inOder(root.right);

	}

	public void insert(int key) {

		root = insertKey(root, key);
	}

	public Node insertKey(Node root, int key) {
		if (root == null) {
			root = new Node(key);
			return root;
		}
		if (root.key > key) {
			root.left = insertKey(root.left, key);
		} else if (root.key < key) {
			root.right = insertKey(root.right, key);
		}
		return root;
	}

	
	public Node deleteKey(Node root, int key) {
		if (root == null || root.key == key) {
			return root;
		}
		if (root.key > key) {
			root.left = deleteKey(root.left, key);
		} else if (root.key < key) {
			root.right = insertKey(root.right, key);
		}
		return root;
	}

	public Node search(Node root, int key) {
		// Base Cases: root is null or key is present at root
		if (root == null || root.key == key)
			return root;

		// val is greater than root's key
		if (root.key > key)
			return search(root.left, key);

		// val is less than root's key
		return search(root.right, key);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		BinarySearchTree b = new BinarySearchTree();
		b.insert(10);
		b.insert(40);
		b.insert(30);
		b.insert(60);
		b.insert(70);
		b.insert(9);
		b.insert(12);
		b.insert(11);
		b.inOrderD();

		System.out.println(b.search(root, 9).key);
	}

}
