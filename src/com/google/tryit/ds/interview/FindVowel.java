package com.google.tryit.ds.interview;

public class FindVowel {

    public static void main(String args[])
    {
        String input="Hello World";
        int vowelCount=0;
        for(int i=0;i<input.length();i++)
        {
            char ch = input.charAt(i);
            if(ch=='a' || ch=='e' || ch=='i' || ch=='o' || ch=='u' || ch=='A' || ch=='E' || ch=='I' || ch=='O' || ch=='U')
            {
                vowelCount++;
            }
        }
        System.out.println("Vowel Count: "+vowelCount);
    }
}
