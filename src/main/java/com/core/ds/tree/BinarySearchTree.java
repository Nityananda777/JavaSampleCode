package com.core.ds.tree;

public class BinarySearchTree {

    BinaryNode root;

    void insert(int val) {
        insert(root, val);
    }

    BinaryNode insert(BinaryNode root, int val) {
        if (root == null) {
            return new BinaryNode(val);
        } else {
            if (val <root.data) {
                root.left = insert(root.left, val);
            } else {
                root.right = insert(root.right, val);
            }
        }
        return root;
    }

    void display(BinaryNode node) {
        if (node != null) {
            display(node.left);
            System.out.print(" " + node.data);
            display(node.right);
        }

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
