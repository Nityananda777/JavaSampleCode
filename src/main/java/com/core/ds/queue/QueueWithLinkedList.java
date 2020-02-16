package com.core.ds.queue;

import com.core.ds.linkedlist.Node;

public class QueueWithLinkedList<T> {
    int size = 0;
    Node<T> rear, font = null;

    public boolean isEmpty() {
        if (font == null && rear == null) {
            System.out.println("...Queue is empty..");
            return true;
        }
        return false;
    }

    public void enQueue(T data) {
        Node<T> newNode = new Node<T>(data);
        if (isEmpty()) {
            rear = newNode;
            font = newNode;
            size++;
        } else {
            rear.next = newNode;
            rear = newNode;
            size++;
        }
    }

    public boolean isFull() {
        return false;
    }

    private T peek() {
        return null;
    }

    private T pool() {
        return null;
    }

    public T deQueue() {
        if (isEmpty()) {
            {
                System.out.println("Queue is empty in deQueue..");
            }
        }
        T val = font.value;
        font = font.next;
        return val;

    }

    public static void main(String[] args) {
        QueueWithLinkedList<String> t = new QueueWithLinkedList<String>();
        t.enQueue("10");
        t.enQueue("20");
        t.enQueue("30");
        t.enQueue("40");
        t.enQueue("50");
        System.out.println(t.deQueue());
        System.out.println(t.deQueue());
        System.out.println(t.deQueue());
        System.out.println(t.deQueue());
        System.out.println(t.deQueue());
    }
}
