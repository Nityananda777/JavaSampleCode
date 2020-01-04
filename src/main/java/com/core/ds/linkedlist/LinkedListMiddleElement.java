package com.core.ds.linkedlist;

public class LinkedListMiddleElement<T> {
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

    Node findMiddleElement(Node head) {
        Node slow = head;
        Node first = head;
        while (first != null && first.next != null) {
            first = first.next.next;
            slow = slow.next;
        }
        return slow;
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
        LinkedListMiddleElement list = new LinkedListMiddleElement();
        Node loopNode = new Node("7");
        head = list.addNode(new Node("5"));
        head = list.addNode(new Node("2"));
        head = list.addNode(loopNode);
        head = list.addNode(new Node("8"));
        head = list.addNode(new Node("10"));
        head = list.addNode(new Node("1"));
        list.printList(head);
        head= list.findMiddleElement(head);
        System.out.println(head.value);
    }
}
