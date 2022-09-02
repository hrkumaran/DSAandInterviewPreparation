package com.google.tryit.ds.google;

import com.google.tryit.ds.SinglyLinkedList;

import java.util.Arrays;
import java.util.OptionalInt;

public class SumofSubSet {

    static class Node {
        int arrayElements;
        int remainingSum;
        SumofSubSet.Node next;

        Node(int arrayElements,int remainingSum) {
            arrayElements = arrayElements;
            remainingSum = remainingSum;
        }
    }

    SumofSubSet.Node head;


    public static void main(String[] args) {
        int a[] = {1,5,6,7,8,6,4,3,2,1,5,6,7,4,8};
        int givenNumber = 9;
   //     int sumNumber = sum(a);

        System.out.println("is sum of GivenNumber=["+givenNumber+"] sumNumber=");
        boolean result=false;
        for(int i=0;i<a.length-1;i++)
        {
    //        System.out.println("Number is="+a[i]);
            int remainingelements =givenNumber - a[i];
            if(Arrays.stream(a).anyMatch(x-> x == remainingelements))
            {
                System.out.println("Available Combination="+a[i]);
                result=true;
            }
        }
        System.out.println("is sum of GivenNumber ["+givenNumber+"] Found in the list"+result);
    }

    private static int sum(int[] a) {
        return Arrays.stream(a).sum();
    }
}
