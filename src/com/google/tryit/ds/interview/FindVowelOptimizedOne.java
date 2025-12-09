package com.google.tryit.ds.interview;

import java.util.regex.Pattern;
import java.util.regex.Matcher;
public class FindVowelOptimizedOne {

    public static void main(String args[])
    {
        String input="Hello World";

        Pattern pattern = Pattern.compile(("[aeiouAEIOU]"));
        Matcher matcher = pattern.matcher(input);
        System.out.println("Vowels found in \"" + input + "\":");
        int vowelCount=0;
        while(matcher.find())
        {
            vowelCount++;
            System.out.print(matcher.group()+",");
        }
        System.out.println();
        System.out.println("Vowel Count: "+vowelCount);
    }
}
