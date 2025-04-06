package com.google.tryit.ds.leetcode;

public class RemoveElement {

    public int removeElement(int[] nums, int val) {
     if(nums.length==0 && val<=0)
         return -1;
     int iternation=0,length = nums.length;
     while(iternation<length)
     {
     //    System.out.println(iternation + " ");
         if(nums[iternation]==val)
         {
             //System.out.println(iternation + " "+val);
             nums[iternation] = nums[length-1];
             length--;
         }
         else
         {
             iternation++;
         }
     }
  /* for (int i : nums) {
            System.out.print(i + " ");
   }*/
    return length;
    }

    public static void main(String[] args) {
        RemoveElement removeElement = new RemoveElement();

        int[] nums1 = {3,2,2,3};
        int m = 3;
     //   System.out.println(removeElement.removeElement(nums1,m));
        nums1 = new int[]{0,1,2,2,3,0,4,2};
        m = 2;
     //   System.out.println(removeElement.removeElement(nums1,m));
        nums1 = new int[]{2};
        m = 3;
        System.out.println(removeElement.removeElement(nums1,m));
    }
}
