package com.core.ds.linkedlist;

public class ReverseSingleLinkedList<T> {
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

    public Node reverse(Node<T> head) {
        Node<T> next = null;
        Node<T> prev = null;
        Node<T> current = head;
        while (current != null) {
            next = current.next;
            current.next = prev;
            prev = current;
            current = next;
        }
        head = prev;
        return head;
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
        ReverseSingleLinkedList list = new ReverseSingleLinkedList();
        head = list.addNode(new Node("5"));
        head = list.addNode(new Node("2"));
        head = list.addNode(new Node("3"));
        head = list.addNode(new Node("8"));
        head = list.addNode(new Node("10"));
        head = list.addNode(new Node("1"));
        list.printList(head);
        System.out.println("....After reverse of LinkedList....");
        head = list.reverse(head);
        list.printList(head);
    }
}
