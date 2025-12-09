package com.google.tryit.ds.interview;

import java.util.regex.Pattern;
import java.util.regex.Matcher;
public class FindVowelOptimizedOne {

    public static void main(String args[])
    {
        String input="Hello World";

        Pattern pattern = Pattern.compile(("[aeiouAEIOU]"));
        Matcher matcher = pattern.matcher(input);
        int vowelCount=0;
        while(matcher.find())
        {
            vowelCount++;
        }
        System.out.println("Vowel Count: "+vowelCount);
    }
}
