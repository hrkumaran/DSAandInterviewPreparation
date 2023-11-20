package com.google.tryit.ds.leetcode;

import com.google.tryit.ds.Stack;

public class ReverseWordinLine {

    public static void main(String args[])
    {
        String singleLine="This is my first program to reverse a word in a line";
        String reverseLine= "";
        System.out.println("Original Line="+singleLine);
        int arraySize = singleLine.split(" ").length;
        Stack newStack = new Stack(arraySize);
        for(String s : singleLine.split(" "))
        {
            newStack.push(s);
        }
        for(int i=0;i<arraySize;i++)
        {
            reverseLine+=newStack.pop()+" ";
        }
        System.out.println("reversed Line="+reverseLine.trim());

    }
}
