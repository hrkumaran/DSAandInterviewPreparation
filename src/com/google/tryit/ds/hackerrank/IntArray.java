package com.google.tryit.ds.hackerrank;

public class IntArray {

    public static void main(String[] args) {
        int[] arr = {1,10,2,25,10,112,111,100};
        System.out.println("Array length: " + arr.length);
        System.out.print("Array elements: ");
        for (int i=0;i<=arr.length-1;i++) {
            if (arr[i]% 10 == 1 || arr[i]% 10 == 0) {

                System.out.print(arr[i] + " ");
            }
        }
    }
}
