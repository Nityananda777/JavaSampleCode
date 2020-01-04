package com.core.ds.tree;

import java.util.LinkedList;
import java.util.Queue;

public class BinaryTree {
    BinaryNode root;

    public void insert(int value) {
        BinaryNode node = new BinaryNode(value);
        if (root == null) {
            root = node;
            return;
        } else {
            Queue<BinaryNode> queue = new LinkedList<>();
            queue.add(root);
            while (!queue.isEmpty()) {
                BinaryNode currNode = queue.remove();
                if (currNode.left == null) {

                    currNode.left = node;
                    System.out.println("Successfully inserted new node !");
                    break;
                } else if (currNode.right == null) {
                    currNode.right = node;
                    System.out.println("Successfully inserted new node !");
                    break;
                } else {
                    queue.add(currNode.left);
                    queue.add(currNode.right);
                }
            }
        }
    }

    public BinaryNode getDeepestNode() {
        Queue<BinaryNode> queue = new LinkedList<>();
        queue.add(root);
        BinaryNode currNode = null;
        while (!queue.isEmpty()) {
            currNode = queue.remove();
            if (currNode.left != null) {
                queue.add(currNode.left);
            } else if (currNode.right != null) {
                queue.add(currNode.right);
            }
        }
        return currNode;
    }

    public BinaryNode getHeightOfTree() {
        Queue<BinaryNode> queue = new LinkedList<>();
        queue.add(root);
        BinaryNode currNode = null;
        while (!queue.isEmpty()) {
            currNode = queue.remove();
            if (currNode.left != null) {
                queue.add(currNode.left);
            } else if (currNode.right != null) {
                queue.add(currNode.right);
            }
        }
        return currNode;
    }

    public void deleteDeepestNode() {
        Queue<BinaryNode> queue = new LinkedList<>();
        queue.add(root);
        BinaryNode prevNode, currNode = null;
        while (!queue.isEmpty()) {
            prevNode = currNode;
            currNode = queue.remove();
            if (currNode.left == null) {
                prevNode.left = null;
            } else if (currNode.right != null) {
                prevNode.right = null;
            }
            queue.add(prevNode.left);
            queue.add(prevNode.right);
        }
    }

    public void search(int value) {
        Queue<BinaryNode> queue = new LinkedList<>();
        queue.add(root);
        while (!queue.isEmpty()) {
            BinaryNode currNode = queue.remove();
            if (currNode.data == value) {
                System.out.println("Value-" + value + " is found in Tree !");
                return;
            } else {
                if (currNode.left != null)
                    queue.add(currNode.left);
                if (currNode.right != null)
                    queue.add(currNode.right);
            }
        }
    }


    public void deleteNode(int value) {
        Queue<BinaryNode> queue = new LinkedList<>();
        queue.add(root);
        while (!queue.isEmpty()) {
            BinaryNode currNode = queue.remove();
            if (currNode.data == value) {
                currNode.data = getDeepestNode().data;
                deleteDeepestNode();
                System.out.println("Deleted the node !!");
                return;
            } else {
                if (currNode.left != null)
                    queue.add(currNode.left);
                if (currNode.right != null) {
                    queue.add(currNode.right);
                }
            }
        }
        System.out.println("Did not find the node!!");

    }

    public void preOrder(BinaryNode node) {
        if (node == null)
            return;
        System.out.print(" " + node.data);
        preOrder(node.left);
        preOrder(node.right);

    }

    public void inOrder(BinaryNode node) {
        inOrder(node.left);
        System.out.print(" " + node.data);
        inOrder(node.right);
    }

    public void postOrder(BinaryNode node) {
        postOrder(node.left);
        postOrder(node.right);
        System.out.println(" " + node.data);
    }

    public void levelOrder(BinaryNode node) {

    }

    public static void main(String[] args) {
        BinaryTree tree = new BinaryTree();
        System.out.println("Inserting 10 nodes to tree");
        for (int i = 1; i <= 10; i++)
            tree.insert(i * 10);
        // System.out.println(tree.getDeepestNode().data);
        tree.preOrder(tree.root);
        System.out.println();
    }
}
