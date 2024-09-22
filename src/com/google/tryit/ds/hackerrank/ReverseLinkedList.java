package com.google.tryit.ds.hackerrank;

import com.google.tryit.ds.SinglyLinkedList;

import java.io.IOException;

public class ReverseLinkedList {

    public static void main(String[] args) throws IOException {
        SinglyLinkedList llist = new SinglyLinkedList();
        int llistCount = 5;
            for (int i = 0; i < llistCount; i++) {
                llist = llist.insertNode(llist, String.valueOf(i));
            }
        llist.printNode(llist);
    }
}