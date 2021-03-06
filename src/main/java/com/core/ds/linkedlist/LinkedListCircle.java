package com.core.ds.linkedlist;

public class LinkedListCircle<T> {
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

    boolean hasCycle(Node head) {
        boolean loop = false;
        if (head == null)
            return false;

        Node slow = head; // moves 1 Node at a time
        Node fast = head; // moves 2 Nodes at a time

        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
            if (slow == fast) {
                loop = true; // since "slow" and "fast" collided
                break;
            }
        }
        return loop;
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
        boolean flag = false;
        LinkedListCircle list = new LinkedListCircle();
        Node loopNode = new Node("7");
        head = list.addNode(new Node("5"));
        head = list.addNode(new Node("2"));
        head = list.addNode(loopNode);
        head = list.addNode(new Node("8"));
        head = list.addNode(new Node("10"));
        head = list.addNode(new Node("1"));
        list.printList(head);
        flag = list.hasCycle(head);
        System.out.println(" Before creating circle ");
        System.out.println("Circle is " + flag);
        head = list.addNode(loopNode);
        System.out.println(" After creating circle ");
        flag = list.hasCycle(head);
        System.out.println("Circle is " + flag);
    }
}