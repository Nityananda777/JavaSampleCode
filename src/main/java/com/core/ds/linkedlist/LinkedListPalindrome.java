package com.core.ds.linkedlist;

public class LinkedListPalindrome {
    Node head;

    boolean isPalidromeUtil(String str) {
        int length = str.length();

        // Match characters from beginning and
        // end.
        for (int i = 0; i < length; i++)
            if (str.charAt(i) != str.charAt(length - i - 1))
                return false;

        return true;
    }

    boolean isPalindrome() {
        Node node = head;
        String str = "";
        while (node != null) {
            str = str.concat((String)node.value);
            node = node.next;
        }
        return isPalidromeUtil(str);
    }

    /* Driver program to test above function */
    public static void main(String[] args) {
        LinkedListPalindrome list = new LinkedListPalindrome();
        list.head = new Node("a");
        list.head.next = new Node("b");
        list.head.next.next = new Node("d");
        list.head.next.next.next = new Node("cb");
        list.head.next.next.next.next = new Node("a");

        System.out.println(list.isPalindrome());

    }
}