package com.google.tryit.macfeeSource;
import java.io.DataInputStream;
import java.io.IOException;
public class ReverseOfString
{
	public static void main(String[] args)
	{
		String str="";
		String re="";
    	 DataInputStream obj= new DataInputStream(System.in);
		 System.out.println("Enter any String: "); 
		try 
		{
		str=obj.readLine();
		}
		catch(IOException e)
		{
			System.out.println("you have entered wrong input");
		} 
		System.out.println("length of the "+str+" is: "+str.length());
		for (int i =str.length()-1; i>=0; i--)
		{
			re=re+str.charAt(i);
		}
		System.out.println("reverse of "+str+" is: "+re);
	}
}
