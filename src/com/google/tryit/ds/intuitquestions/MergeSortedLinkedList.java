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
        mergeSortList = mergeSortList(firstSortedList,secondSortedList);
        mergeSortList.printNode(mergeSortList);
    }

    private static SinglyLinkedListInt mergeSortList(SinglyLinkedListInt firstSortedList, SinglyLinkedListInt secondSortedList) {
        SinglyLinkedListInt mergedSortList = new SinglyLinkedListInt();
        SinglyLinkedListInt tempSortList = new SinglyLinkedListInt();
        while (firstSortedList.head != null || secondSortedList.head!=null ) {
            if (firstSortedList.head == null) {
                return firstSortedList;
            } else if (secondSortedList.head == null) {
                return secondSortedList;
            }
            if (firstSortedList.head.value <secondSortedList.head.value)
            {
                tempSortList.head = firstSortedList.head;
                firstSortedList.head = firstSortedList.head.next;
            }
            else
            {
                tempSortList.head = secondSortedList.head;
                secondSortedList.head = secondSortedList.head.next;
            }
            mergedSortList.head = tempSortList.head;
            mergedSortList.head.next = mergedSortList.head;
            tempSortList.head.next = tempSortList.head;
        }
        return mergedSortList;
    }
}
