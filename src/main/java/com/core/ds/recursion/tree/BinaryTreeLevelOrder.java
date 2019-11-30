package com.core.ds.recursion.tree;

import java.util.LinkedList;
import java.util.Queue;

public class BinaryTreeLevelOrder {

	public static class TreeNode {
		int data;
		TreeNode left;
		TreeNode right;

		TreeNode(int data) {
			this.data = data;
		}
	}

	public static void levelOrderTraversal(TreeNode rootNode)
	// prints in level order
	{
		Queue<TreeNode> queue = new LinkedList<TreeNode>();
		queue.add(rootNode);
		while (!queue.isEmpty()) {
			TreeNode t = queue.poll();
			System.out.println(t.data);
			if (t.left != null) {
				queue.add(t.left);
			}
			if (t.right != null) {
				queue.add(t.right);
			}
		}
	}

	public static int getMaximumItr(TreeNode startNode) {

		Queue<TreeNode> queue = new LinkedList();
		queue.add(startNode);
		int max = Integer.MIN_VALUE;
		while (!queue.isEmpty()) {
			TreeNode tempNode = queue.poll();
			if (max < tempNode.data)
				max = tempNode.data;
			if (tempNode.left != null)
				queue.add(tempNode.left);
			if (tempNode.right != null)
				queue.add(tempNode.right);
		}
		return max;
	}

	public static void printAllPathsToLeaf(TreeNode node, int[] path, int len) {
		if (node == null)
			return;

		// storing data in array
		path[len] = node.data;
		len++;

		if (node.left == null && node.right == null) {
			// leaf node is reached
			printArray(path, len);
			return;
		}

		printAllPathsToLeaf(node.left, path, len);
		printAllPathsToLeaf(node.right, path, len);
	}

	public static void printArray(int[] path, int len) {
		for (int i = 0; i < len; i++) {
			System.out.print(" " + path[i]);
		}
		System.out.println();
	}

	public static void printLeafNode(TreeNode node) {

		if (node == null) {
			return;
		}
		if (node.left == null && node.right == null) {
			System.out.println(node.data);
		}
		printLeafNode(node.left);
		printLeafNode(node.right);
	}

	public static void main(String[] args) {
		// Creating a binary tree
		TreeNode rootNode = createBinaryTree();
	//	System.out.println("Level Order traversal of binary tree will be:");
		// levelOrderTraversal(rootNode);
		// System.out.println(getMaximumItr(rootNode));
	//	System.out.println("Number of leaf nodes in binary tree :" + getLeafCountOfBinaryTree(rootNode));
		//printLeafNode(rootNode);
		printAllPathsToLeaf(rootNode, new int[1000], 0);
	}

	public static int getLeafCountOfBinaryTree(TreeNode node) {
		int count = 0;
		if (node == null)
			return 0;
		if (node.left == null && node.right == null)
			return 1;
		else
			count = count + getLeafCountOfBinaryTree(node.left);
		count = count + getLeafCountOfBinaryTree(node.right);
		return count;
	}

	public static TreeNode createBinaryTree() {

		TreeNode rootNode = new TreeNode(40);
		TreeNode node20 = new TreeNode(20);
		TreeNode node10 = new TreeNode(10);
		TreeNode node30 = new TreeNode(30);
		TreeNode node60 = new TreeNode(60);
		TreeNode node50 = new TreeNode(50);
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
