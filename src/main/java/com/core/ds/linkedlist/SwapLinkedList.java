package com.core.ds.linkedlist;

public class SwapLinkedList<T> {
    static Node head;

    public Node addNode(Node node) {
        if (head == null) {
            head = node;
        } else {
            Node temp = head;
            while (temp.next != null) {
                temp = temp.next;
            }
            temp.next= node;
        }
        return  head;
    }

    void printList(Node<T> head) {
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.value + " ");
            temp = temp.next;
        }
        System.out.println();
    }

    public Node swapLinkedList() {
        Node<T> temp = head;
        while (temp != null && temp.next != null) {
            T k = temp.value;
            temp.value = temp.next.value;
            temp.next.value = k;
            temp = temp.next.next;
        }
        return head;
    }

    public static void main(String[] args) {
        SwapLinkedList list = new SwapLinkedList();
        head = list.addNode(new Node("5"));
        head = list.addNode(new Node("2"));
        head = list.addNode(new Node("3"));
        head = list.addNode(new Node("8"));
        head = list.addNode(new Node("10"));
        head = list.addNode(new Node("1"));
        list.printList(head);
        System.out.println("....After swap of LinkedList....");
        head = list.swapLinkedList();
        list.printList(head);
    }
}
