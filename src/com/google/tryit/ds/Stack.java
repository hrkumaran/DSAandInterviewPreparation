package com.google.tryit.ds;

public class Stack {

	String[] elements = null;
	int counter=-1;
	//int arraySize=0;

	public Stack(int size)
	{
		elements = new String[size];
	}
	public void push(String s)
	{
		if(elements!=null) {
			counter++;
		}
		elements[counter] = s;
	}

	public String pop()
	{
		String output = "";
		if(elements!=null) {
			output = elements[counter];
			counter--;
		}
		else {
			output= "";
		}
		return output;
	}
}
