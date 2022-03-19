package com.google.tryit.macfeeSource;

public class Basics_Parameter {
	
	public void sample2(String str3){		
		System.out.println("Welcome "+str3);
	}
	public void add(int a, int b)
	{
		int c=a+b;
		System.out.println(c);
	}
	public void add(String a,String b)
	{
		String c=a.concat(b);
		System.out.println(c);
	}
	public static void main(String[] args) {
		Basics_Parameter a=new Basics_Parameter();//Object/instance
		a.add(5, 4);	
		a.add("5", "4");
		
	}

}

