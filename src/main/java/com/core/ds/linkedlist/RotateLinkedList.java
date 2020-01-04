package com.core.ds.linkedlist;

public class RotateLinkedList<T> {
    static Node head;

    public Node addNode(Node node) {
        if (head == null) {
            head = node;
        } else {
            Node temp = head;
            while (temp.next != null) {
                temp = temp.next;
            }
            temp.next = node;

        }
        return head;
    }

    private Node rotateLeft(int k, Node head) {
        Node curr = head;
        Node newHead = null;
        Node heads = null;
        int count = 0;
        while (curr != null) {
            if (count == k) {
                break;
            }
            curr = curr.next;
            count++;
        }
        newHead = curr.next;
        curr.next = null;
        heads = newHead;
        while (heads.next != null) {
            heads = heads.next;
        }
        heads.next = head;
        return newHead;

    }

    private Node rotateRight(int k, Node head) {
        Node curr = head;
        Node newHead = null;
        Node heads = null;
        int len = 0;
        while (curr != null) {
            curr = curr.next;
            len++;
        }
        while (curr != null) {
            if (len == k)
                break;
            curr = curr.next;

        }
        return null;
    }

    void printList(Node<T> head) {
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.value + " ");
            temp = temp.next;
        }
        System.out.println();
    }

    public static void main(String[] args) {
        RotateLinkedList list = new RotateLinkedList();
        head = list.addNode(new Node("1"));
        head = list.addNode(new Node("2"));
        head = list.addNode(new Node("3"));
        head = list.addNode(new Node("4"));
        head = list.addNode(new Node("5"));
        head = list.addNode(new Node("6"));
        list.printList(head);
        head = list.rotateLeft(1, head);
        list.printList(head);
    }
}
