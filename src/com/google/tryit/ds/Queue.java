package com.google.tryit.ds;

public class Queue {

	public final int MAX_SIZE = 21;
	private Object data[] = new Object[MAX_SIZE];
	private int counter = -1;
    private int dequeueCounter = 1;
	public int enqueue(String dataComing) {
		if (counter >=MAX_SIZE-1) {
			System.out.println("Stack s OverFlowing");
			return 0;
		} else {
			data[++counter] = dataComing;
			return counter;
		}
	}

	public String dequeue() {
		if (dequeueCounter >= MAX_SIZE) {
			return "No more items in Stack";
		} else {
			Object dataComing = data[dequeueCounter++];
			return String.valueOf(dataComing);
		}

	}

	public String peek() {
		Object dataComing = data[counter];
		return String.valueOf(dataComing);
	}

}
