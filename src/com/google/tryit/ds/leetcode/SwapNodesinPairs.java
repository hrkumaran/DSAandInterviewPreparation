package com.google.tryit.ds.leetcode;

public class SwapNodesinPairs {
    public ListNode swapPairs(ListNode head) {
        if(head==null) return null;
        ListNode temporaryNode = new ListNode();
        temporaryNode.next=head;
        ListNode node = temporaryNode;
        while(node!=null)
        {
            ListNode first=node.next;
            ListNode second = null;
            if(first!=null){
                second = first.next;
            }
            if(second!=null){
                ListNode secondNext = second.next;
                second.next=first;
                node.next=second;
                first.next=secondNext;
                node=first;
            }
            else
            {
                break;
            }
        }
        return temporaryNode.next;

    }
}
