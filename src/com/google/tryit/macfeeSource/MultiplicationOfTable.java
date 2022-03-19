//MultiplicationOfTable

package com.google.tryit.macfeeSource;

	import java.util.Scanner;

	 public class MultiplicationOfTable{
	     public static void main(String[] args){
	         Scanner in = new Scanner(System.in);
	         System.out.println("Enter a number whose table you want: ");
	         int n = in.nextInt();
	        
	         System.out.println("Table of "+n+" is: ");
	         for(int i=1; i<=10; i++){
	             System.out.println(n+"*"+i+"="+(n*i));
	         }
	        
	     }
	 }
