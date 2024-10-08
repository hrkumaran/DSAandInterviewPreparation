package com.google.tryit.ds.hackerrank;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

class Result {

    /*
     * Complete the 'sockMerchant' function below.
     *
     * The function is expected to return an INTEGER.
     * The function accepts following parameters:
     *  1. INTEGER n
     *  2. INTEGER_ARRAY ar
     */

    public static int sockMerchant(int n, List<Integer> ar) {
        // Write your code here
        Map<Integer,Integer> containMap = new HashMap<>();
        Integer frequency = null;
        int totalCounter=0;
        int i=0;
        while(i < n) {
            frequency=containMap.get(i);
            if(frequency==null)
            {
                containMap.put(ar.get(i), 1);
            }
            else{
                containMap.put(ar.get(i),frequency+1);
            }
            i++;
        }

        // Traversing through Map using for-each loop
        for (Map.Entry<Integer, Integer> me :
                containMap.entrySet()) {

            // Printing keys
            System.out.print(me.getKey() + ":");
            System.out.println(me.getValue());
        }
        return totalCounter;
    }

}

public class ShoesPair {
    public static void main(String[] args) {

        int n = 9;

        List<Integer> ar = Arrays. asList(10, 20, 20, 10, 10, 30, 50, 10, 20);

        int result = Result.sockMerchant(n, ar);

        System.out.println(result);
    }
}