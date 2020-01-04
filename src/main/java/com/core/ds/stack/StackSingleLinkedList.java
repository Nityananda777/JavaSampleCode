package com.core.ds.stack;

import com.core.ds.linkedlist.Node;

public class StackSingleLinkedList<T> {
    Node head;
    int size;
    T data;

    public boolean isEmpty() {
        return (size == 0);
    }

    public void push(T data) {
        Node<T> newNode = new Node<T>(data);
        if (isEmpty()) {
            head = newNode;
            size++;
        } else {
            Node temp = head;
            newNode.next = temp;
            head = newNode;
            size++;
        }
    }

    public void traverse() {
        Node<T> temp = head;
        while (temp != null) {
            System.out.println(temp.value);
            temp = temp.next;
        }
    }

    public int pop() {
        if (isEmpty()) {
            System.out.println("...Stack is empty..");
        }
        int value = (Integer) head.value;
        head = head.next;
        return value;
    }

    public static void main(String[] args) {
        StackSingleLinkedList<Integer> s = new StackSingleLinkedList();
        s.push(10);
        s.push(11);
        s.push(12);
        s.push(13);
        s.push(14);
        s.push(15);
        System.out.println(s.pop());
        System.out.println(s.pop());
        System.out.println(s.pop());
        System.out.println(s.pop());
        System.out.println(s.pop());
        System.out.println(s.pop());
    }
}
