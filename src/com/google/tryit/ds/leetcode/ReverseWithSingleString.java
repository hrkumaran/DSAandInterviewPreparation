package com.google.tryit.ds.leetcode;

public class ReverseWithSingleString {

    public static void main(String args[])
    {

        String output="All is well India is my country";
        char[] inputArray = output.toCharArray();
        //new char[];
        char[] outputArray = reverse(inputArray,0,inputArray.length);
        System.out.println(outputArray);
        char[] resultArray = new char[inputArray.length];
        int count=0;
      //  StringBuilder str = new StringBuilder();
        for(int i=0,j=outputArray.length;i<outputArray.length-1&&j>0;i++,j--)
        {
          count++;
          if(outputArray[i]==' ' || i==outputArray.length)
          {
              resultArray=reverse(outputArray,count,i);
          //    System.out.println("count="+count);
              count=0;
          }
        //    str.append(toString(resultArray));
        }
     //   System.out.println(str);
   //       System.out.println(inputArray);

    }

    private static char[] reverse(char[] inputArray,int start, int length)
    {
        char[] outputArray = new char[length];
    //    System.out.println(new String(outputArray));
   //     System.out.println("start="+start);
        for(int i=length-1,j=start;i>start&&j<length-1;i--,j++)
        {
  //          System.out.println("In="+inputArray[i]);
            outputArray[j] = inputArray[i];
//              System.out.println("out="+outputArray[j]);

        }
 //       System.out.println("First Part="+outputArray.length);
        return outputArray;

    }

        // Method
        // To convert a character array to a string
        // using the StringBuilder class
        public static String toString(char[] a)
        {
            // Creating object of String class
            StringBuilder sb = new StringBuilder();

            // Creating a string using append() method
            for (int i = 0; i < a.length; i++) {
                sb.append(a[i]);
            }
         //   System.out.println("First Word="+sb);
            return sb.toString();
        }




}
