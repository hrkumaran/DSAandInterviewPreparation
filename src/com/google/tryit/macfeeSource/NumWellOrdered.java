/*Identify a number is well ordered or not ?
			 Note- A number is well ordered if all digits are in ascending order ex- 123456789.
			 Not well ordered number - ex- 2341 (because here 1 is coming after 4 so it is not well ordered.)
*/

package com.google.tryit.macfeeSource;

 import java.util.ArrayList;
 import java.util.Arrays;
 import java.util.List;
 import java.util.Scanner;
 
	 public class NumWellOrdered {
     public static void main(String[] args) {
         System.out.print("Enter a number: ");
         Scanner in = new Scanner(System.in);
         int n = in.nextInt();
         int r=0, s=n, j=0;
         List<Integer> num = new ArrayList<Integer>();
         while(s!=0){
            r = s%10;
            s = s/10;
            num.add(r);
          }
			        
			         for(j=(num.size()-1); j>0; j--){
			             if(num.get(j)>num.get(j-1)){
			                 System.out.println("Number "+n+" is not well ordered");
			                 break;
			             }
			         }
			         if(j==0){
			             System.out.println("Number "+n+" is well ordered");
			         }
			     }
			 }
