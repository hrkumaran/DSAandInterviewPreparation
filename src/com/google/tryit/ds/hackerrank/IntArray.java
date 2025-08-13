package com.google.tryit.ds.hackerrank;

public class IntArray {

    public static void main(String[] args) {
        int[] arr = {1,10,2,25,10,112,111,100,102,12,123,33,13,57,47,89,35,67,8,9,0};
        int[] output = new int[10];
        System.out.println("Array length: " + arr.length);
        System.out.print("Array elements: ");
        for (int i=0,j=0;i<=arr.length-1;i++) {
            if(getFirstDigit(arr[i])==1) {
                output[j]=arr[i];
                j++;
            }
        }
        for (int num : output) {
            System.out.print(num + " ");
        }
    }

    public static int getFirstDigit(int num) {
        while (num >= 10) {
            num /= 10;
        }
        return num;
    }
}
