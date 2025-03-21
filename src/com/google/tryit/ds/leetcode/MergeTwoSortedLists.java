package com.google.tryit.ds.leetcode;

public class MergeTwoSortedLists {
    public ListNode mergeTwoLists(ListNode list1, ListNode list2) {
        ListNode temporaryNode = new ListNode(0);
        ListNode l3 = temporaryNode;
        while(list1!=null && list2!=null)
        {
            if(list1.val < list2.val)
            {
                l3.next = list1;
                list1 = list1.next;
            }
            else
            {
                l3.next = list2;
                list2 = list2.next;
            }
            l3 =l3.next;
        }

        if(list1!=null)
        {
            l3.next = list1;
            list1 = list1.next;
        }
        if(list2!=null)
        {
            l3.next = list2;
            list2 = list2.next;
        }

        return temporaryNode.next;


    }

    public static void main(String[] args) {
        MergeTwoSortedLists mergeTwoSortedLists = new MergeTwoSortedLists();
        ListNode l1 = addListNode(1,2,4);
        printListNode(l1);
        ListNode l2 = addListNode(1,3,4);
        printListNode(l2);
        ListNode l3= mergeTwoSortedLists.mergeTwoLists(l1,l2);
        printListNode(l3);
    }

    private static ListNode addListNode(int i, int i1, int i2) {
        ListNode newListNode = new ListNode(i);
        newListNode.next =  new ListNode(i1);
        newListNode.next.next =  new ListNode(i2);
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
}
