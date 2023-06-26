package com.google.tryit.ds.interview;

public class ReverseWordsinLine {

    public static void main(String[] args) {
        String s="See whether u can able to reverse the word in the given line";
        String[] wordArray = s.split(" ");
        System.out.println(s.length());
        StringBuilder outoutString = new StringBuilder();
        for(int i=wordArray.length-1;i>=0;i--)
        {
            outoutString.append(wordArray[i]+" ");
        }
        System.out.println(outoutString.toString().trim());
        System.out.println(outoutString.toString().trim().length());
    }
}
