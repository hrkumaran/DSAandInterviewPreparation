package com.google.tryit.ds.intuitquestions;

import com.google.tryit.ds.SinglyLinkedListInt;

public class MergeSortedLinkedList {

    public static void main(String[] args) {
        SinglyLinkedListInt firstSortedList = new SinglyLinkedListInt();
        SinglyLinkedListInt secondSortedList = new SinglyLinkedListInt();
        SinglyLinkedListInt mergeSortList = new SinglyLinkedListInt();
        int[] firstArrayElements={1,3,5,7};
        int[] seondArrayElements={2,4,6};
        for (int i = 0; i < firstArrayElements.length; i++) {

            firstSortedList = firstSortedList.insertNode(firstSortedList, firstArrayElements[i]);
        }
    //    firstSortedList.printNode(firstSortedList);
        for (int i = 0; i < seondArrayElements.length; i++) {
        secondSortedList = secondSortedList.insertNode(firstSortedList, seondArrayElements[i]);
        }
    //    secondSortedList.printNode(secondSortedList);
                mergeSortList.head = mergeSortList(firstSortedList.head, secondSortedList.head);
        System.out.println("Result=");
        mergeSortList.printNode(mergeSortList);
    }

  /*  private static SinglyLinkedListInt mergeSortList(SinglyLinkedListInt.Node firstSortedNode, SinglyLinkedListInt.Node secondSortedNode) {
        SinglyLinkedListInt mergedSortNode = new SinglyLinkedListInt();
        while (firstSortedNode != null || secondSortedNode!=null ) {
            SinglyLinkedListInt.Node tempSortNode = new SinglyLinkedListInt.Node(0);
            if (firstSortedNode == null) {
     //           return firstSortedNode;
            } else if (secondSortedNode == null) {
     //           return secondSortedNode;
            }
            if (firstSortedNode.value <firstSortedNode.value)
            {
                tempSortNode = firstSortedNode;
                firstSortedNode.next= firstSortedNode;
            }
            else
            {
                tempSortNode = secondSortedNode;
                secondSortedNode.next = secondSortedNode;
            }
            mergedSortNode.head = tempSortNode;
            mergedSortNode.head.next = tempSortNode.next;
            tempSortNode.next = tempSortNode;
        }
        return mergedSortNode;
    }*/

    static SinglyLinkedListInt.Node mergeSortList(SinglyLinkedListInt.Node headA, SinglyLinkedListInt.Node headB)
    {

    /* a dummy first node to
       hang the result on */
        SinglyLinkedListInt.Node dummyNode = new SinglyLinkedListInt.Node(0);

    /* tail points to the
    last result node */
        SinglyLinkedListInt.Node tail = dummyNode;
        while(true)
        {

        /* if either list runs out,
        use the other list */
            if(headA == null)
            {
                tail.next = headB;
                break;
            }
            if(headB == null)
            {
                tail.next = headA;
                break;
            }

        /* Compare the data of the two
        lists whichever lists' data is
        smaller, append it into tail and
        advance the head to the next Node
        */
            if(headA.value <= headB.value)
            {
                tail.next = headA;
                headA = headA.next;
            }
            else
            {
                tail.next = headB;
                headB = headB.next;
            }

            /* Advance the tail */
            tail = tail.next;
        }
        return dummyNode.next;
    }
}
