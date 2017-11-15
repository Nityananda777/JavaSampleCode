package com.core.ds;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class BinaryTree {

	public static class TreeNode {
		int data;
		TreeNode left;
		TreeNode right;

		TreeNode(int data) {
			this.data = data;
		}
	}

	// prints in level order
	public static void levelOrderTraversal(TreeNode startNode) {

		Queue<TreeNode> s = new LinkedList<TreeNode>();
		s.add(startNode);
		while (!s.isEmpty()) {
			TreeNode temp = s.poll();
			System.out.println("data.." + temp.data);
			if (temp.left != null) {
				s.add(temp.left);
			}
			if (temp.right != null) {
				s.add(temp.right);
			}
		}

	}

	public static void levelReverseTravarsal(TreeNode currentNode) {
		Stack<TreeNode> s = new Stack<TreeNode>();
		Queue<TreeNode> q = new LinkedList<TreeNode>();
		q.add(currentNode);
		while (!q.isEmpty()) {
			TreeNode temp = q.poll();
			if (temp.right != null) {
				q.add(temp.left);
			}
			if (temp.right != null) {
				q.add(temp.right);
			}
			s.push(temp);
		}
		while (!s.isEmpty()) {
			System.out.println(s.pop().data);
		}
	}

	public static void printLeafNode(TreeNode currentNode) {
		Queue<TreeNode> q = new LinkedList<TreeNode>();
		Queue<TreeNode> q1 = new LinkedList<TreeNode>();

		q.add(currentNode);

		while (!q.isEmpty()) {
			TreeNode temp = q.poll();
			// System.out.println("data.." + temp.data);
			if (temp.left != null) {
				q.add(temp.left);
				q1.add(temp.left);
			}
			if (temp.right != null) {
				q.add(temp.right);
				q1.add(temp.right);

			}
		}
		while (!q1.isEmpty()) {
			TreeNode t = q1.poll();
			if (t.left == null && t.right == null) {
				System.out.println(t.data);
			}
		}

	}

	public static void main(String[] args) {
		BinaryTree bi = new BinaryTree();
		// Creating a binary tree
		TreeNode rootNode = createBinaryTree();
		System.out.println("Level Order traversal of binary tree will be:");
		// levelOrderTraversal(rootNode);
		// levelReverseTravarsal(rootNode);
		printLeafNode(rootNode);
	}

	public static TreeNode createBinaryTree() {

		TreeNode rootNode = new TreeNode(10);
		TreeNode node20 = new TreeNode(20);
		TreeNode node10 = new TreeNode(30);
		TreeNode node30 = new TreeNode(40);
		TreeNode node60 = new TreeNode(50);
		TreeNode node50 = new TreeNode(60);
		TreeNode node70 = new TreeNode(70);

		rootNode.left = node20;
		rootNode.right = node60;

		node20.left = node10;
		node20.right = node30;

		node60.left = node50;
		node60.right = node70;

		return rootNode;
	}
}
