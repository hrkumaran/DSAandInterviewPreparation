package com.google.tryit.macfeeSource;
//Program for print i's in india and print count also
public class Print_Is_InIndiaAndCount {
public static void main(String[] args) {
// TODO Auto-generated method stub
String str="india";
char c='i';
int count=0;
System.out.println("length of the "+str+" is: "+str.length());
for(int i=0; i < str.length(); i++)
{
	if(str.charAt(i)==c)
	{
	System.out.println(str.charAt(i));
	count++;
	}
}
System.out.println("the number of counts(i's) in "+str+" are: "+count);
	}

}
