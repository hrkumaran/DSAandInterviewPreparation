package com.google.tryit.ds.leetcode;

public class RemoveDuplicatesfromSortedArray {
    public int removeDuplicates(int[] nums) {
        if(nums.length<=0)
            return 0;
        int length = nums.length;
        for(int j : nums){
            System.out.print("Start iterate ");
            System.out.print(j + " ");
            System.out.println();
        }
        for(int i=0;i<length;i++)
        {
            if(nums[i]==nums[i+1])
            {
                System.out.print("if main b");
                System.out.print(length + " "+i+" "+nums.length);
                System.out.println();
                nums[i] = nums[i+1];
                length--;
                System.out.print("if main a");
                System.out.print(length + " "+i+" "+nums.length);
                System.out.println();
                for(int j : nums){
                    System.out.print("if iterate ");
                    System.out.print(j + " ");
                    System.out.println();
                }
            }
                    }
        for(int j : nums){
            System.out.print("Final iterate ");
            System.out.print(j + " ");
            System.out.println();
        }
        return length;
    }

    public static void main(String[] args) {
        RemoveDuplicatesfromSortedArray removeElement = new RemoveDuplicatesfromSortedArray();

        int[] nums1 = {1,1,2};
        System.out.println(removeElement.removeDuplicates(nums1));
        nums1 = new int[]{0,1,2,2,3,0,4,2};
        System.out.println(removeElement.removeDuplicates(nums1));
        nums1 = new int[]{2};
        System.out.println(removeElement.removeDuplicates(nums1));
    }
}
