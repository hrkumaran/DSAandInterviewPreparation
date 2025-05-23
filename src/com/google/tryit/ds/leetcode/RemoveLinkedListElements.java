package com.google.tryit.ds.leetcode;

public class RemoveLinkedListElements {

    private static ListNode addListNode(int i, int i1, int i2, int i3) {
        ListNode newListNode = new ListNode(i);
        newListNode.next =  new ListNode(i1);
        newListNode.next.next =  new ListNode(i2);
        newListNode.next.next.next =  new ListNode(i3);
     //   newListNode.next.next.next.next =  new ListNode(i4);
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

    public ListNode removeLinkedListElementsValue(ListNode head ,int val) {
        if (head == null ) return null;
        ListNode output = new ListNode(0);
        output.next = head;
        ListNode  prev= output, current = head;
        while(current!=null)
        {
            if(current.val == val)
            {
                prev.next = current.next;
            }
            else
            {
                prev = current;
            }
            current = current.next;
        }
        return output.next;
    }

    public static void main(String[] args) {
        RemoveLinkedListElements removeLinkedListElements = new RemoveLinkedListElements();
        ListNode inputNode = removeLinkedListElements.addListNodeNew(1,2,6,3,4,5,6);
        removeLinkedListElements.printListNode(inputNode);
        ListNode l1= removeLinkedListElements.removeLinkedListElementsValue(inputNode,6);
        removeLinkedListElements.printListNode(l1);
        inputNode = removeLinkedListElements.addListNode(7,7,7,7);
        removeLinkedListElements.printListNode(inputNode);
        ListNode l3= removeLinkedListElements.removeLinkedListElementsValue(inputNode,7);
        removeLinkedListElements.printListNode(l3);
        inputNode = removeLinkedListElements.addListNodeone(1,2);
        removeLinkedListElements.printListNode(inputNode);
        ListNode l4= removeLinkedListElements.removeLinkedListElementsValue(inputNode,1);
        removeLinkedListElements.printListNode(l4);
    }

    private static ListNode addListNodeone(int i, int i1) {
        ListNode newListNode = new ListNode(i);
        newListNode.next =  new ListNode(i1);
        return newListNode;
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
}
