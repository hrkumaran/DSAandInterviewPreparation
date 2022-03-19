package com.google.tryit.macfeeSource;
//Program for Perfect number
import java.io.DataInputStream;
import java.io.IOException;
public class PerfectNumber {
public static void main(String[] args) {
// TODO Auto-generated method stub
int n=0;
int r=0;
int q=0;
int temp=0;
int p=0;
DataInputStream obj= new DataInputStream(System.in);
System.out.println("Enter any integer:"); 
try {
n=Integer.parseInt(obj.readLine());
} catch(IOException e){System.out.println("you have entered wrong input");}
q=n;
for(int i=1; i<=n; i++)
{
r=q%i;
if(r==0)
{
temp=temp+i;
}
}
p=temp/2;
if(n==p)
{
System.out.println(n+":is a Perfect number");
}
else
{
System.out.println(n+":is not a perfect number");
}
}
}