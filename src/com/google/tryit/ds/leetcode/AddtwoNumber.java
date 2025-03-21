package com.google.tryit.ds.leetcode;

class AddTwoNumbers {
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode temporaryNode = new ListNode(0);
        ListNode l3 = temporaryNode;
        int tempValue = 0;
        while(l1!=null && l2!=null)
        {
            int add = l1.val + l2.val+tempValue;
            tempValue = add /10;
            l3.next= new ListNode(add % 10);
            l1 = l1.next;
            l2 = l2.next;
            l3 = l3.next;
        }
        while(l1!=null)
        {
            int add = l1.val +tempValue;
            tempValue = add /10;
            l3.next= new ListNode(add % 10);
            l1 = l1.next;
            l3 = l3.next;
        }
        while(l2!=null)
        {
            int add = l2.val +tempValue;
            tempValue = add /10;
            l3.next= new ListNode(add % 10);
            l2 = l2.next;
            l3 = l3.next;
        }
        if(tempValue!=0)
        {
            l3.next = new ListNode(tempValue);
        }
        return temporaryNode.next;
    }

    public static void main(String[] args) {
        AddTwoNumbers addTwoNumbers = new AddTwoNumbers();
        ListNode l1 = addListNode(1,8,4);
        printListNode(l1);
        ListNode l2 = addListNode(1,3,4);
        printListNode(l2);
        ListNode l3= addTwoNumbers.addTwoNumbers(l1,l2);
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
