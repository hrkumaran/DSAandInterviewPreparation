package com.google.tryit.ds.leetcode;

public class MergeSortedArray {

    public void merge(int[] nums1, int m, int[] nums2, int n) {

        if(m<=0 && n<=0) return;
        int nums1pointer= m-1;
        int nums2pointer = n-1;
        int outputnums1pointer=m+n-1;
        while(nums2pointer>=0)
        {
            if(nums1pointer>=0 && nums1[nums1pointer] > nums2[nums2pointer])
            {
                nums1[outputnums1pointer--] = nums1[nums1pointer--];

            }
            else
            {
                nums1[outputnums1pointer--] = nums2[nums2pointer--];
            }
        }
    }

    public static void main(String[] args) {
        MergeSortedArray mergeSortedArray = new MergeSortedArray();
        int[] nums1 = {1,2,3,0,0,0};
        int m = 3;
        int[] nums2 = {2,5,6};
        int n = 3;
        mergeSortedArray.merge(nums1,m,nums2,n);
       /* for (int i : nums1) {
            System.out.print(i + " ");
        }*/
        nums1 = new int[]{1};
        m = 1;
        nums2 = new int[]{};
        n = 0;
        mergeSortedArray.merge(nums1,m,nums2,n);
       /* for (int i : nums1) {
            System.out.print(i + " ");
        }*/
    }

}
