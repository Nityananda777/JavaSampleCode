package com.core.ds.linkedlist;

public class MergeLinkedList {
     Node head;

    public void addNode(Node node) {
        if (head == null) {
            head = node;
        } else {
            Node temp = head;
            while (temp.next != null) {
                temp = temp.next;
            }
            temp.next = node;
        }
    }

    public void printList(Node head) {
        Node tmp = head;
        while (tmp != null) {
            System.out.print(tmp.value + " ");
            tmp = tmp.next;
        }
        System.out.println();
    }

    public Node mergeList(Node node1, Node node2) {
        Node head = new Node(0);
        Node newNode = head;
        while (node1 != null && node2 != null) {
            if ((Integer) node1.value < (Integer) node2.value) {
                newNode.next = node1;
                node1 = node1.next;
            } else {
                newNode.next = node2;
                node2 = node2.next;
            }
            newNode = newNode.next;
        }
        if (node1 != null) {
            newNode.next = node1;
        }
        if (node2 != null) {
            newNode.next = node2;
        }
        return head.next;
    }

    public static void main(String[] args) {
        MergeLinkedList list1 = new MergeLinkedList();
        MergeLinkedList list2 = new MergeLinkedList();
        list1.addNode(new Node(6));
        list1.addNode(new Node(7));
        list1.addNode(new Node(8));
        list1.addNode(new Node(9));
        list1.addNode(new Node(10));
        list1.addNode(new Node(11));


        list2.addNode(new Node(2));
        list2.addNode(new Node(3));
        list2.addNode(new Node(4));
        list2.addNode(new Node(5));


        System.out.println("....After Merge of LinkedList....");
        list1.head = list1.mergeList(list1.head, list2.head);
        list1.printList(list1.head);
    }
}
