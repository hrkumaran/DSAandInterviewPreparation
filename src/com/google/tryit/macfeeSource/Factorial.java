package com.google.tryit.macfeeSource;
import java.io.DataInputStream;
public class Factorial {
	public static void main(String[] args) {
        int n;
        int factorial=1;
        DataInputStream obj= new DataInputStream(System.in);
        try
        {
        	System.out.println("Enter any integer:");
        	n=Integer.parseInt(obj.readLine());
        	for(int i=n;i>=1;i--)
        	{
        		factorial=factorial*i;
        	}
        	System.out.println("Factorial of "+n+" is : "+factorial);
        }
         catch(Exception e)
           {
        	System.out.println("you have given wrong input");
        	}
	}
}
