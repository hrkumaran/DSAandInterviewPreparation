package com.google.tryit.ds.leetcode;

class Solution {
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
}
