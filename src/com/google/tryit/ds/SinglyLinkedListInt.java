package com.google.tryit.ds;

public class SinglyLinkedListInt {
    public static class Node {
        public int value;
        public SinglyLinkedListInt.Node next;

        public Node(int d) {
            value = d;
            next = null;
        }
    }

    public SinglyLinkedListInt.Node head;

    public static SinglyLinkedListInt insertNode(SinglyLinkedListInt list, int data) {
        SinglyLinkedListInt.Node newNode = new SinglyLinkedListInt.Node(data);
        if (list.head == null) {
            list.head = newNode;
        } else {
            SinglyLinkedListInt.Node last = list.head;
            while (last.next != null) {
                last = last.next;
            }

            last.next = newNode;
        }
        return list;
    }

    public static void printNode(SinglyLinkedListInt list) {
        SinglyLinkedListInt printNode = list;
        while (printNode.head != null) {
            System.out.print(printNode.head.value+",");
            printNode.head = printNode.head.next;
        }
        System.out.println();
    }
    public static void reverseList(SinglyLinkedListInt list) {
        SinglyLinkedListInt.Node first;
        SinglyLinkedListInt rest;

        /* empty list */
        if (list == null)
            return;

        first = list.head;
        //rest = first;

        /* List has only one node */
        first.next.next = first;

        first.next = null;
    }
}
