package com.google.tryit.ds.leetcode;

public class Tryit {
    public static void main(String[] args) {
        Tryit removeDuplicatesfromSortedList = new Tryit();
        ListNode inputNode = addListNodeNew(1,2,3,3,4,4,5);
        printListNode(inputNode);
        ListNode l1= removeDuplicatesfromSortedList.getValues(inputNode);
        printListNode(l1);
        inputNode = removeDuplicatesfromSortedList.addListNode(1,1,1,2,3);
        printListNode(inputNode);
        ListNode l3= removeDuplicatesfromSortedList.getValues(inputNode);
        printListNode(l3);
    }

    private ListNode getValues(ListNode inputNode) {

        ListNode listNode = inputNode;
        while(inputNode!=null)
        {
            if(listNode ==null)
            {
                listNode = new ListNode(inputNode.val);
            }
            else
            {
                while(listNode.next!=null)
                {
                    listNode = listNode.next;
                }
                listNode.next = new ListNode(inputNode.val);
     //           printListNode(listNode);

            }
            inputNode = inputNode.next;
        }
        return listNode;
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
