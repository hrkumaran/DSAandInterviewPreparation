package com.google.tryit.ds.leetcode;

public class mergeKLists {
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
}
