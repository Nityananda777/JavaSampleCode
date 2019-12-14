package com.core.ds.linkedlist;

public class SortedDoubleLinkedList {

    static Node sortedInserts(Node head, int value) {
        Node newNode = new Node(value);
        if (head == null) {
            head = newNode;
        } else if ((Integer) head.value >= (Integer) newNode.value) {
            newNode.next = head;
            newNode.next.prev = newNode;
            head = newNode;
        } else {
            Node curr = head;
            while (curr.next != null && (Integer) curr.next.value < (Integer) newNode.value) {
                curr = curr.next;
            }
            if (curr.next != null) {
                newNode.next = curr.next;
                newNode.next.prev = newNode;
            }
            curr.next = newNode;
            newNode.prev = curr;
        }
        return head;
    }

    private static Node deleteDuplicate(Node head) {
        Node curr = head;
        while (curr != null) {
            Node temp = curr;
            while (temp != null && temp.value == curr.value) {
                temp = temp.next;
            }
            curr.next = temp;
            curr = curr.next;
        }
        return curr;
    }


    static void printList(Node head) {
        while (head != null) {
            System.out.print(head.value + " ");
            head = head.next;
        }
    }

    // Driver code
    public static void main(String args[]) {
        /* start with the empty doubly linked list */
        Node head = null;
        // insert the following nodes in sorted way
        head = sortedInserts(head, 8);
        head = sortedInserts(head, 5);
        head = sortedInserts(head, 3);
        head = sortedInserts(head, 10);
        head = sortedInserts(head, 12);
        head = sortedInserts(head, 9);
        head = sortedInserts(head, 7);
        head = sortedInserts(head, 7);
        System.out.println("Created Doubly Linked List");
        printList(head);
        System.out.println();
        System.out.println("After delete duplicate");
        deleteDuplicate(head);
        printList(head);
    }
}

