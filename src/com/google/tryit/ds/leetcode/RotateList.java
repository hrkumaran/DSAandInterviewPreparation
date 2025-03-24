package com.google.tryit.ds.leetcode;

public class RotateList {
    public static void main(String[] args) {
        RotateList rotateList = new RotateList();
        ListNode l1 = addListNode(1,2,3,4,5);
        printListNode(l1);
        int k=2;
        ListNode l3= rotateList.rotateRight(l1,k);
        printListNode(l3);
    }

    private static ListNode addListNode(int i, int i1, int i2, int i3, int i4) {
        ListNode newListNode = new ListNode(i);
        newListNode.next =  new ListNode(i1);
        newListNode.next.next =  new ListNode(i2);
        newListNode.next.next.next =  new ListNode(i3);
        newListNode.next.next.next.next =  new ListNode(i4);
        return newListNode;
    }
    private static void printListNode(ListNode newListNode) {
        System.out.print("[");
        while(newListNode!=null)
        {
            System.out.print(newListNode.val+",");
            newListNode = newListNode.next;
        }
        System.out.print("]");
    }

    public ListNode rotateRight(ListNode head, int k) {
        if (head == null || k < 0) return null;
        int counter = 0;
        ListNode temporaryNode = new ListNode();
        temporaryNode.next = head;
        ListNode l3 = temporaryNode;
        ListNode outputNode = new ListNode();
        while (l3.next != null) {
            l3 = l3.next;
            counter++;
        }
        l3 = temporaryNode;
        while (l3.next != null) {
            int tempCount = 0;
            if (k < counter) {
                System.out.println("k="+k);
                System.out.println("counter="+counter);
                outputNode = new ListNode(l3.val);;
            }
            l3 = l3.next;
            outputNode = outputNode.next;
        }
        return outputNode;
    }
}
