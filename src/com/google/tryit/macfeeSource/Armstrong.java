package com.google.tryit.macfeeSource;
//Program to check whether a number is Armstrong or not
import java.io.*;
class Armstrong
{ public static void main(String ar[])
{
int n=153,sum=0;

int q,r;
q=n;
while(q>0)
{
	r=q%10;
sum=sum+r*r*r;
q=q/10;
}
if(n==sum)
System.out.println(n+":is an armstrong number");
else
System.out.println(n+":is not an armstrong number");
}
}
