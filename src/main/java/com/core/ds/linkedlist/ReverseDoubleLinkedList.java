package com.core.ds.linkedlist;

public class ReverseDoubleLinkedList<T> {
    static Node head;
    public Node addNode(Node node) {
        Node prv = head;
        if (head == null) {
            head = node;
        } else {
            Node temp = head;
            while (temp.next != null) {
                temp = temp.next;

            }
            temp.next = node;
            node.prev = temp;
        }
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

    public Node reverse(Node head) {
        Node current = head;
        Node prev = null;
        while (current != null) {
            prev=current;
            current = current.next;
        }
        while (prev != null) {
            System.out.print(prev.value+" ");
            prev = prev.prev;
        }
        return head;
    }

    public static void main(String[] args) {
        ReverseDoubleLinkedList list = new ReverseDoubleLinkedList();
        head = list.addNode(new Node("5"));
        head = list.addNode(new Node("2"));
        head = list.addNode(new Node("3"));
        head = list.addNode(new Node("8"));
        head = list.addNode(new Node("10"));
        head = list.addNode(new Node("1"));
        list.printList(head);
        System.out.println("....After reverse of LinkedList....");
        head = list.reverse(head);
    }
}
