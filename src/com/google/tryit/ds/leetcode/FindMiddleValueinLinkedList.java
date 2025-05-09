package com.google.tryit.ds.leetcode;

public class FindMiddleValueinLinkedList {

    public static void main(String[] args) {
        FindMiddleValueinLinkedList findMiddleValueinLinkedList = new FindMiddleValueinLinkedList();
        ListNode inputNode = findMiddleValueinLinkedList.addListNode(1,2,3,4,5);
        findMiddleValueinLinkedList.printListNode(inputNode);
        int middleValue = findMiddleValueinLinkedList.findMidValueinLinkedList(inputNode);
        System.out.println("MiddleValue="+middleValue);
        ListNode inputNodeTwo = findMiddleValueinLinkedList.addListNode(2,3,4,5,6);
        findMiddleValueinLinkedList.printListNode(inputNodeTwo);
        middleValue = findMiddleValueinLinkedList.findMidValueinLinkedList(inputNodeTwo);
        System.out.println("MiddleValue="+middleValue);
        inputNodeTwo = findMiddleValueinLinkedList.addListNodeTwo(2,3,4,5,6,7);
        findMiddleValueinLinkedList.printListNode(inputNodeTwo);
        middleValue = findMiddleValueinLinkedList.findMidValueinLinkedList(inputNodeTwo);
        System.out.println("MiddleValue="+middleValue);
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

    private int findMidValueinLinkedList(ListNode inputNode) {
        if(inputNode==null) {
            return -1;
        }
        ListNode tempNode= inputNode;
        int counter=0;
        int outputMiddleValue=0;
        while(tempNode.next!=null)
        {
            tempNode= tempNode.next;
            counter++;
        }
        int midCounter=0;
        if(counter%2==0)
        {
            midCounter=counter/2;
        }
        else {
            midCounter=counter/2+1;
        }
        counter=0;
        while(inputNode.next!=null)
        {
            if(midCounter == counter)
            {
                outputMiddleValue = inputNode.val;
            }
            inputNode= inputNode.next;
            counter++;
        }
        return outputMiddleValue;
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
