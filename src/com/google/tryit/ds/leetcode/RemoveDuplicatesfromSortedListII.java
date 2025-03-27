package com.google.tryit.ds.leetcode;

public class RemoveDuplicatesfromSortedListII {

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

    public ListNode removeDuplicatesfromSortedList(ListNode head) {
        if (head == null ) return null;
        ListNode originalNode = head;
        ListNode skipNode = head;
        while(skipNode!=null && skipNode.next!=null)
        {
            if(skipNode.val == skipNode.next.val)
            {
                originalNode = originalNode.next;
                skipNode = skipNode.next.next;
            }
            else
            {
                originalNode = originalNode.next;
                skipNode = skipNode.next;
            }

        }
        return originalNode;
    }

    public static void main(String[] args) {
        RemoveDuplicatesfromSortedListII removeDuplicatesfromSortedListII = new RemoveDuplicatesfromSortedListII();
        ListNode inputNode = removeDuplicatesfromSortedListII.addListNodeNew(1,2,3,3,4,4,5);
        removeDuplicatesfromSortedListII.printListNode(inputNode);
        ListNode l1= removeDuplicatesfromSortedListII.removeDuplicatesfromSortedList(inputNode);
        removeDuplicatesfromSortedListII.printListNode(l1);
        inputNode = removeDuplicatesfromSortedListII.addListNode(1,1,1,2,3);
        ListNode l3= removeDuplicatesfromSortedListII.removeDuplicatesfromSortedList(inputNode);
        removeDuplicatesfromSortedListII.printListNode(l3);
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
}
