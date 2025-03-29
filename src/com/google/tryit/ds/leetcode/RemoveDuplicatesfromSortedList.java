package com.google.tryit.ds.leetcode;

public class RemoveDuplicatesfromSortedList {

    public ListNode removeDuplicatesfromSortedList(ListNode head) {
        if (head == null ) return null;
        ListNode skipNode = head;
        while(skipNode!=null && skipNode.next!=null)
        {
            if(skipNode.next.val == skipNode.val)
            {
               // skipNode.next = skipNode.next.next;
                int skippable = skipNode.val;
                while (skipNode.next!=null && skippable ==  skipNode.next.val )
                {
                    skipNode.next = skipNode.next.next;
                }
            }
            else
            {
                skipNode = skipNode.next;
            }
        }
        return head;
    }

    public static void main(String[] args) {
        RemoveDuplicatesfromSortedList removeDuplicatesfromSortedList = new RemoveDuplicatesfromSortedList();
        ListNode inputNode = removeDuplicatesfromSortedList.addListNodeNew(1,2,3,3,4,4,5);
        removeDuplicatesfromSortedList.printListNode(inputNode);
        ListNode l1= removeDuplicatesfromSortedList.removeDuplicatesfromSortedList(inputNode);
        removeDuplicatesfromSortedList.printListNode(l1);
        inputNode = removeDuplicatesfromSortedList.addListNode(1,1,1,2,3);
        removeDuplicatesfromSortedList.printListNode(inputNode);
        ListNode l3= removeDuplicatesfromSortedList.removeDuplicatesfromSortedList(inputNode);
        removeDuplicatesfromSortedList.printListNode(l3);
    }

    private static ListNode addListNodeNew(int i, int i1, int i2, int i3, int i4, int i5, int i6) {
        ListNode newListNode = new ListNode(i);
        newListNode.next =  new ListNode(i1);
        newListNode.next.next =  new ListNode(i2);
        newListNode.next.next.next =  new ListNode(i3);
        newListNode.next.next.next.next =  new ListNode(i4);
        newListNode.next.next.next.next.next =  new ListNode(i5);
        newListNode.next.next.next.next.next.next =  new ListNode(i6);
        return newListNode;
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
        System.out.println();
    }
}
