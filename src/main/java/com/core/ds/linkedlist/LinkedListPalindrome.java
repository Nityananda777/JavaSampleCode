package com.core.ds.linkedlist;

public class LinkedListPalindrome<T> {
    Node head;

    public  boolean isPalindromicWithOutExtraSpace(Node head) {
        if (head == null || head.next == null)
            return true;
        Node slow = head;
        Node fast = head;
        Node curr = head;
        Node next = null;
        while (fast != null && fast.next != null) {
            fast = fast.next.next;
            slow = slow.next;
        }
        //In case of ODD number
        if (fast != null) {
            slow = slow.next;
        }
        next = reverse(slow);

        while (curr != null && next != null) {
            if (curr.value!=next.value){
                return false;
            }
            next = next.next;
            curr = curr.next;
        }

        return true;
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
    /* Driver program to test above function */
    public static void main(String[] args) {
        LinkedListPalindrome list = new LinkedListPalindrome();
        list.head = new Node("a");
        list.head.next = new Node("c");
        list.head.next.next = new Node("d");
        list.head.next.next.next = new Node("b");
        list.head.next.next.next.next = new Node("a");
        System.out.println(list.isPalindromicWithOutExtraSpace(list.head));

    }
}