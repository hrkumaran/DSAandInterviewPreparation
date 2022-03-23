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
        firstSortedList.printNode(firstSortedList);
        for (int i = 0; i < seondArrayElements.length; i++) {
        secondSortedList = secondSortedList.insertNode(firstSortedList, seondArrayElements[i]);
        }
        secondSortedList.printNode(secondSortedList);
        mergeSortList = mergeSortList(firstSortedList,secondSortedList);
        mergeSortList.printNode(mergeSortList);
    }

    private static SinglyLinkedListInt mergeSortList(SinglyLinkedListInt firstSortedList, SinglyLinkedListInt secondSortedList) {
        if(firstSortedList==null)
        {
            return firstSortedList;
        }
        else if (secondSortedList==null)
        {
            return secondSortedList;
        }
        return firstSortedList;
    }
}
