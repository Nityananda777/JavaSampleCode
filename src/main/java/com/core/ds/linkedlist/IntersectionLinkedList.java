package com.core.ds.linkedlist;

public class IntersectionLinkedList {
    Node head;  // head of list


    void printList(Node head) {
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.value + " ");
            temp = temp.next;
        }
        System.out.println();
    }

    void push(int new_data) {
        Node new_node = new Node(new_data);
        new_node.next = head;
        head = new_node;
    }

    public Node findIntersection(Node node1, Node node2) {
        Node temp1 = node1;
        Node temp2 = node2;
        int lengthNode1 = 0;
        int lengthNode2 = 0;
        //Find length
        while (temp1.next != null) {
            {
                temp1 = temp1.next;
                lengthNode1++;
            }
            while (temp2.next != null) {
                {
                    temp2 = temp2.next;
                    lengthNode2++;
                }
            }
        }
        //find difference
        Node dif1 = head;
        Node diff2 = head;
        int difference = 0;
        if (lengthNode1 > lengthNode2) {
            difference = lengthNode1 - lengthNode2;
            int i = 0;
            while (i < difference) {
                dif1 = dif1.next;
                i++;
            }
        } else {
            difference = lengthNode2 - lengthNode1;
            int j = 0;
            while (j < difference) {
                diff2 = diff2.next;
                j++;
            }
        }
        //find common node
        while (dif1 != null && diff2 != null) {
            if (dif1 == diff2) {
                return dif1;
            }
            dif1 = dif1.next;
            diff2 = diff2.next;
        }
        return  null;
    }


    public static void main(String args[]) {
        IntersectionLinkedList llist1 = new IntersectionLinkedList();
        IntersectionLinkedList llist2 = new IntersectionLinkedList();


        /*create a linked lits 10->15->5->20 */
        llist1.push(20);
        llist1.push(4);
        llist1.push(15);
        llist1.push(10);

        /*create a linked lits 8->4->2->10 */
        llist2.push(10);
        llist2.push(2);
        llist2.push(4);
        llist2.push(8);

        llist1.head= llist1.findIntersection(llist1.head,llist2.head);

        llist1.printList(llist1.head);
    }
}