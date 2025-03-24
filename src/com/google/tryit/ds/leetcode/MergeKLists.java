package com.google.tryit.ds.leetcode;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

public class MergeKLists {
    public ListNode mergeKLists(ListNode[] lists) {
        if(lists==null || lists.length==0) return null;

        int counter = 1;
        while(counter<lists.length)
        {
            for(int i=0;i+counter<lists.length;i=i+counter*2)
            {
                lists[i] = mergeTwoLists(lists[i],lists[i+counter]);
            }
            counter=counter*2;
        }

        return lists[0];

    }

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
        MergeKLists mergeKLists = new MergeKLists();
        ListNode l1 = addListNode(1,8,4);
        printListNode(l1);
        ListNode l2 = addListNode(1,3,4);
        printListNode(l2);
        ListNode[] listNodes = new ListNode[2];
        listNodes[0]=l1;
        listNodes[1]=l2;
        ListNode l3= mergeKLists.mergeKLists(listNodes);
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
