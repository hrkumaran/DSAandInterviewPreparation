package com.google.tryit.macfeeSource;

public class fibonacci_num {

	public static void main(String[] args) {
		
		int series[] = new int[10];
		series[0] = 0;
		series[1] = 1;
		
		for(int i=2; i <10; i++){
		
		series[i] = series[i-1] + series[i-2];
		
		}
		
		for(int i=0; i<10 ; i++){
		
		System.out.print(series[i] + " ");
		
		}
		
		 
		
	}

}
