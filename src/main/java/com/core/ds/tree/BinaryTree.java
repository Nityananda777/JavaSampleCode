package com.core.ds.tree;

import java.util.LinkedList;
import java.util.Queue;

public class BinaryTree {
    BinaryNode root;

    public void insert(BinaryNode node) {
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

    public int getHeightOfTree() {
        Queue<BinaryNode> queue = new LinkedList<>();
        queue.add(root);
        BinaryNode currNode = null;
        int heightLeft = 0;
        int heightRight = 0;
        while (!queue.isEmpty()) {
            currNode = queue.remove();
            if (currNode.left != null) {
                queue.add(currNode.left);
                heightLeft++;
            } else if (currNode.right != null) {
                queue.add(currNode.right);
                heightRight++;
            }
        }
        return heightLeft > heightRight ? heightLeft : heightRight;
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

    public static int height(BinaryNode root) {
        // Write your code here.
        int height = 0;
        if (root == null) {
            height = -1;
        } else {
            height = 1 + Math.max(height(root.left), height(root.right));
        }
        return height;

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
        if (node == null)
            return;
        inOrder(node.left);
        System.out.print(" " + node.data);
        inOrder(node.right);
    }

    public void postOrder(BinaryNode node) {
        if (node == null)
            return;
        postOrder(node.left);
        postOrder(node.right);
        System.out.print(" " + node.data);
    }


    public void levelOrder(BinaryNode node) {
        if (node == null) {
            return;
        }
        Queue<BinaryNode> queue = new LinkedList<>();
        queue.add(node);
        while (!queue.isEmpty()) {
            node = queue.remove();
            System.out.print(node.data + " ");
            if (node.left != null) {
                queue.add(node.left);
            }
            if (node.right != null) {
                queue.add(node.right);
            }
        }

    }

    public static void main(String[] args) {
        BinaryNode root = new BinaryNode(1);
        root.left = new BinaryNode(2);
        root.right = new BinaryNode(3);
        root.left.left = new BinaryNode(4);
        root.left.right = new BinaryNode(5);
        root.right.left = new BinaryNode(6);
        root.right.right = new BinaryNode(7);
        root.left.left.left = new BinaryNode(8);
        root.right.left.right = new BinaryNode(9);
        System.out.println("Inserting 10 nodes to tree");
        // System.out.println(tree.getDeepestNode().data);

        BinaryTree tree = new BinaryTree();
        tree.insert(root);
        System.out.println("After InOrder Traversal.");
        tree.inOrder(root);
        System.out.println();
        System.out.println("After PreOrder Traversal.");
        tree.preOrder(root);
        System.out.println();
        System.out.println("After PostOrder Traversal.");
        tree.postOrder(root);
        System.out.println();
        System.out.println("After LevelOrder Traversal.");
        tree.levelOrder(root);
        System.out.println();
        System.out.println("height is " + tree.height(root));
    }
}
