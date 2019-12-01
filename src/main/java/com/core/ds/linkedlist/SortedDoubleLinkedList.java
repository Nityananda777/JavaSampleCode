package com.core.ds.linkedlist;

class NodeList {
    int data;
    NodeList next, prev;

    public NodeList(int data) {
        this.data = data;
    }
}

public class SortedDoubleLinkedList {
    static NodeList sortedInsert(NodeList head, int data) {
        NodeList newNode = new NodeList(data);
        if (head == null) {
            head = newNode;
        } else if (head.data >= newNode.data) {
            newNode.next = head;
            newNode.next.prev = newNode;
            head = newNode;
        } else {
            NodeList current = head;
            while (current.next != null &&
                    current.next.data < newNode.data) {
                current = current.next;
            }
            if (current.next != null) {
                newNode.next = current.next;
                newNode.next.prev = newNode;
            }
            current.next = newNode;
            newNode.prev = current;
        }
        return head;
    }

    static NodeList sortedInserts(NodeList head, int data) {
        NodeList newNode = new NodeList(data);
        if (head == null) {
            head = newNode;
        } else if (head.data >= newNode.data) {
            newNode.next = head;
            newNode.next.prev = newNode;
            head = newNode;
        } else {
            NodeList curr = head;
            while (curr.next != null && curr.next.data < newNode.data) {
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

    private static NodeList deleteDuplicate(NodeList head) {
        NodeList curr = head;
        while (curr != null) {
            NodeList temp = curr;
            while (temp != null && temp.data == curr.data) {
                temp = temp.next;
            }
            curr.next = temp;
            curr = curr.next;
        }
        return  curr;
    }


    static void printList(NodeList head) {
        while (head != null) {
            System.out.print(head.data + " ");
            head = head.next;
        }
    }

    // Driver code
    public static void main(String args[]) {
        /* start with the empty doubly linked list */
        NodeList head = null;
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

