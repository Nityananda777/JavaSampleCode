package com.core.ds.tree;

public class BinarySearchTree {

    BinaryNode root;

    void insert(int val) {
        insert(root, val);
    }

    BinaryNode insert(BinaryNode currNode, int val) {
        BinaryNode node = new BinaryNode(val);
        if (currNode == null) {
            currNode = node;
        } else if (val < currNode.data) {
            currNode.left = insert(currNode.left, val);
        } else if (val > currNode.data) {
            currNode.right = insert(currNode.right, val);
        }
        return currNode;
    }

    BinaryNode display(BinaryNode node) {
        if (node != null) {
            display(node.left);
            System.out.print(" " + node.data);
            display(node.right);
        }
        return node;
    }


    public static void main(String[] args) {
        BinarySearchTree tree = new BinarySearchTree();
        tree.insert(1);
        tree.insert(5);
        tree.insert(6);
        tree.insert(3);
        tree.insert(9);
        tree.insert(8);
        tree.insert(2);
        tree.insert(4);
        tree.insert(7);
        tree.display(tree.root);

    }
}
