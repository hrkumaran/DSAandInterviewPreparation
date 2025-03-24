package com.google.tryit.ds.leetcode;

public class ReverseNodesinkGroup
{
    public static void main(String[] args) {
        ReverseNodesinkGroup reverseNodesinkGroup = new ReverseNodesinkGroup();
        ListNode l1 = addListNode(1,2,3,4,5);
        printListNode(l1);
        int k=2;
        ListNode l3= reverseNodesinkGroup.reverseKGroup(l1,k);
        printListNode(l3);
    }

    public static ListNode reverseKGroup(ListNode head, int k) {
        if(head==null || k<0) return null;
        int counter = 0;
        ListNode temporaryNode = new ListNode();
        temporaryNode.next  = head;
        ListNode l3 = temporaryNode;
        while(l3.next!=null)
        {
            l3 = l3.next;
            counter++;
        }
        l3 = temporaryNode;
        while(l3.next!=null)
        {
            if(counter<k)
            {
                break;
            }
            int tempNodecount = k-1;
            ListNode l3next = l3.next;
            ListNode first = l3.next;
            ListNode second = first.next;

            while(tempNodecount-->0)
            {
                ListNode next = second.next;
                second.next = first;
                first = second;
                second = next;
            }
            counter=counter-k;
            l3.next = first;
            l3next.next = second;
            l3 = l3next;
        }
        return temporaryNode.next;
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


}
