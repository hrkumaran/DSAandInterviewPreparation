package com.google.tryit.macfeeSource;

public class Basics {
	private String str; //Global declaration
	public String s; //Global declaration
	
	public void sample1(){
		//String str; //Local Declaration
		str="Suresh"; //Assigning the value	
		System.out.println("Welcome "+str);
		sample2();
		sample3();
	}
	public void sample2(){
		//String str1="Mahesh";//Declare and assign the value	
		str="Mahesh";
		System.out.println("Welcome "+str);	
	}
	public void sample3(){
		//String str2="Rajesh";	
		str="Rajesh";
		System.out.println("Welcome "+str);	
	}	

	public static void main(String[] args) {
		Basics b=new Basics(); //Object or instance
		b.sample1();

	}

}


