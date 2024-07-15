package com.google.tryit.macfeeSource;
//Program to check the number is Palindrome

import java.io.DataInputStream;
import java.io.IOException;
	 class Palindrome { 
		 public static void main(String ar[]) {
			 int n=0,re=0,temp=0,q;
			 DataInputStream obj= new DataInputStream(System.in);
			 System.out.println("Enter any integer:"); 
			 try 
			 {
			 n=Integer.parseInt(obj.readLine());
			 }
			 catch(IOException e)
			 {
				 System.out.println("you have entered wrong input");
				 } 
			 q=n;
			 while(q>0)
			 {
				re=q%10;
				temp=(temp*10)+re;
				 // re=(re*10)+q%10;
				 q=q/10; 
				 } 
			 if(n==temp)
			 {
				 System.out.println("Reverse of "+n+" is : "+temp+", and is a palindrome number");
			 }
	else 
		{
		System.out.println("Reverse of "+n+" is : "+temp+", and is not a palindrome number"); }
		}
	}

