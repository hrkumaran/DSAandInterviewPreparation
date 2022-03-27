package com.google.tryit.ds.hackerrank;

import com.google.tryit.ds.SinglyLinkedList;
import java.io.IOException;

public class ReverseLinkedList {

    public static void main(String[] args) throws IOException {
        SinglyLinkedList llist = new SinglyLinkedList();
        int llistCount = 5;
            for (int i = 0; i < llistCount; i++) {
                int llistItem =i;
                System.out.println(llistItem);
                llist = llist.insertNode(llist, String.valueOf(llistItem));
            }
       // llist.reverseList(llist);
        llist.printNode(llist);
    }
}