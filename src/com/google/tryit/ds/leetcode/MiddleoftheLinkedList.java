package com.google.tryit.ds.leetcode;

public class MiddleoftheLinkedList {

    public static void main(String[] args) {
        MiddleoftheLinkedList middleoftheLinkedList = new MiddleoftheLinkedList();
        ListNode inputNode = middleoftheLinkedList.addListNode(1,2,3,4,5);
        middleoftheLinkedList.printListNode(inputNode);
        ListNode outoutNode = middleoftheLinkedList.middleinLinkedList(inputNode);
        middleoftheLinkedList.printListNode(outoutNode);
        ListNode inputNodeTwo = middleoftheLinkedList.addListNodeTwo(1,2,3,4,5,6);
        middleoftheLinkedList.printListNode(inputNodeTwo);
        ListNode outoutNodeTwo = middleoftheLinkedList.middleinLinkedList(inputNodeTwo);
        middleoftheLinkedList.printListNode(outoutNodeTwo);
    }

    private ListNode addListNodeTwo(int i, int i1, int i2, int i3, int i4, int i5) {
        ListNode newListNode = new ListNode(i);
        newListNode.next =  new ListNode(i1);
        newListNode.next.next =  new ListNode(i2);
        newListNode.next.next.next =  new ListNode(i3);
        newListNode.next.next.next.next =  new ListNode(i4);
        newListNode.next.next.next.next.next =  new ListNode(i5);
        return newListNode;
    }

    private ListNode middleinLinkedList(ListNode head) {
        if(head==null)
        {
            return null;
        }
        ListNode temporaryNode = head;
        ListNode outputNode = new ListNode();
        int counter=1;
        while(temporaryNode.next!=null)
        {
            counter++;
            temporaryNode = temporaryNode.next;
        }
        int middleCounterValue=0;
        if((counter%2)==0)
        {
            middleCounterValue = counter/2+1;
        }
        else
        {
            middleCounterValue = counter/2+1;
        }
        counter=1;
        while(head.next!=null)
        {
            if(middleCounterValue==counter)
            {
                outputNode = head;
            }
            counter++;
            head = head.next;
        }
        return outputNode;
    }

    private static ListNode addListNode(int i, int i1, int i2,int l3,int l4) {
        ListNode newListNode = new ListNode(i);
        newListNode.next =  new ListNode(i1);
        newListNode.next.next =  new ListNode(i2);
        newListNode.next.next.next =  new ListNode(l3);
        newListNode.next.next.next.next =  new ListNode(l4);
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
