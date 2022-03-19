// Compare String with/without using equals() method.

package com.google.tryit.macfeeSource;
 import java.util.Scanner;

	 public class CompareString
	 {
	     public static void main(String[] args)
	     {
	         Scanner in = new Scanner(System.in);
	         System.out.println("Enter the 1st String: ");
	         String s1 = in.next();
	         System.out.println("Enter the 2nd String: ");
	         String s2 = in.next();

	         // 1st approach without using equals() method
	         System.out.println("*********compare by 1st approach************");
	         if(s1.length()==s2.length())
	         {
	             for(int i=0; i<s1.length(); i++)
	             {
	                 if(s1.charAt(i)!=s2.charAt(i))
	                 {
	                     System.out.println("String "+s1+" is not equal to string "+s2);
	                     break;
	                 }
	                 }
	            System.out.println("String "+s1+" is equal to string "+s2);
	         }
	         else
	         {
	             System.out.println("String "+s1+" is not equal to string "+s2);
	         }

	         //2nd approach , just use equals() method
	         System.out.println("*********compare by 2nd approach************");
	         if(s1.equals(s2))
	         {
	             System.out.println("String "+s1+" is equal to string "+s2);
	         }
	         else
	         {
	             System.out.println("String "+s1+" is not equal to string "+s2);
	         }   
	     }
	 }