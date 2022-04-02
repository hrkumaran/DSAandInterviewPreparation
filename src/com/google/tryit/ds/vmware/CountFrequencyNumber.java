package com.google.tryit.ds.vmware;

import java.util.HashMap;
import java.util.Map;

public class CountFrequencyNumber {
    public static void main(String[] args) {
        int arr[] = {2, 3, 3, 2, 5};
        Map<Integer,Integer> CountFrequency = new HashMap<>();
        int count=0;

        for(int i=0;i<arr.length;i++)
        {
  //          System.out.println(arr[i]);
            CountFrequency.put(arr[i],0);
        }
        // To print the keys and values
        CountFrequency.forEach((K,V)->{                 // mapofmaps entries
            System.out.println("Input Number="+K+" counter="+V);       // print key and value of inner Hashmap
        });
        count=0;
        // 2. For-each loop
        for (Integer key: CountFrequency.keySet()) {
            System.out.println(key);
           /* if(key == )
            {
                count++;
            }*/
        //    CountFrequency.put(arr,count);
        }
        // To print the keys and values
        CountFrequency.forEach((K,V)->{                 // mapofmaps entries
                System.out.println("Input Number="+K+" counter="+V);       // print key and value of inner Hashmap
        });
    }
}
