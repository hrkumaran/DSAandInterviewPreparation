package com.google.tryit.macfeeSource;
//Progam for prime number
import java.io.DataInputStream;
import java.io.IOException;
public class PrimeNumber {
public static void main(String[] args) {
// TODO Auto-generated method stub
int n=0;
int r=0;
int q=0;
int count=0;
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
count++;
}
}
if(count==2)
{
System.out.println(n+":is a Prime number");
}
else
{
System.out.println(n+":is not a prime number");
}
}
}
