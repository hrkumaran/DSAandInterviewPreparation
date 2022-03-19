package com.google.tryit.ds.leetcode;

public class ReverseWithSingleString {

    public static void main(String args[])
    {
        String output="India is my country";
        char[] inputArray = output.toCharArray();
        //new char[];
        char[] outputArray = reverse(inputArray,inputArray.length-1);
        char[] resultArray = new char[inputArray.length];
        for(int i=0,j=outputArray.length;i<outputArray.length-1&&j>0;i++,j--)
        {
          if(outputArray[i]==' ' || i==outputArray.length)
          {
              resultArray=reverse(outputArray,i);
          }
        }
        output = new String(resultArray);
        System.out.println(inputArray);
        System.out.println(resultArray);
    }

    private static char[] reverse(char[] inputArray,int length)
    {
        char[] outputArray = new char[length];
        for(int i=length,j=0;i>0&&j<length-1;i--,j++)
        {
            outputArray[j] = inputArray[i];
        }
        return outputArray;

    }

}
