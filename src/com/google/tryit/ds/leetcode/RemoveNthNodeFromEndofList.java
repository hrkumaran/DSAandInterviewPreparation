package com.google.tryit.ds.leetcode;

public class RemoveNthNodeFromEndofList {
    public ListNode removeNthFromEnd(ListNode head, int n) {
        ListNode temporaryNode = new ListNode(0,head);
        ListNode leftNode = temporaryNode;
        ListNode rightNode = head;
        while(n>0 && rightNode!=null)
        {
            rightNode = rightNode.next;
            n--;
        }
        while(rightNode!=null)
        {
            rightNode = rightNode.next;
            leftNode = leftNode.next;
        }
        leftNode.next = leftNode.next.next;

        return temporaryNode.next;

    }
}
