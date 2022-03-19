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
       /* else
        {

        } */
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

/*
package com.google.tryit.ds;

public class Stack {

	public final int MAX_SIZE = 21;
	private Object data[] = new Object[MAX_SIZE];
	private int counter = -1;

	public int push(String dataComing) {
		if (counter >=MAX_SIZE-1) {
			System.out.println("Stack s OverFlowing");
			return 0;
		} else {
			data[++counter] = dataComing;
			return counter;
		}
	}

	public String pop() {
		if (counter == -1) {
			return "No more items in Stack";
		} else {
			Object dataComing = data[counter--];
			return String.valueOf(dataComing);
		}

	}

	public String peek() {
		Object dataComing = data[counter];
		return String.valueOf(dataComing);
	}

}
*/
