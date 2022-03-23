package com.google.tryit.ds;

public class SinglyLinkedListInt {
    static class Node {
        int value;
        SinglyLinkedListInt.Node next;

        Node(int d) {
            value = d;
            next = null;
        }
    }

    SinglyLinkedListInt.Node head;

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
        while (list.head != null) {
            System.out.println(list.head.value);
            list.head = list.head.next;
        }
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
        //	if (rest == null)
        //		return;

        /* reverse the rest list and put the first element at the last */
        //	reverseList(rest);
        first.next.next = first;

        first.next = null;

        /* change the head pointer */
        //	list.head = rest;
    }
}
