package com.google.tryit.ds.hackerrank;

public class AddTwoArray {

    public static void main(String[] args) {
        int[] arr1 = {8, 2, 7};
        int[] arr2 = {4, 8, 6};
        int[] result = addTwoArrays(arr1, arr2);

        System.out.print("Resultant Array: ");
        for (int num : result) {
            System.out.print(num + " ");
        }
    }

    private static int[] addTwoArrays(int[] arr1, int[] arr2) {
        for(int i=arr1.length-1;i>=0;i--)
        {
            System.out.print(arr1[i] + " ");
        }
        return new int[0];
    }
}
