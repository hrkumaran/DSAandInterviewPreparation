package com.google.tryit.sorting;

public class QuickSort {

	public static void main(String[] args) {

		int input[] = { 2, 5, 17, 3, 1, 89, 46, 23, 5, 7, 6 };
		int result[] = doQuickSort(input);
		System.out.print("{");
		for (int i = 0; i < input.length; i++) {
			System.out.print(result[i] + ",");
		}
		System.out.print("}");

	}

	public static int[] doQuickSort(int input[]) {
		/*
		 * if (input.length == 0) { return 0; }
		 */
		boolean result=false;
		while(!result)
		{
			result= true;
		for (int i = 0; i < input.length - 1; i++) {
			if (input[i] > input[i + 1]) {
				int swap;
				swap = input[i];
				input[i] = input[i + 1];
				input[i + 1] = swap;
				result=false;
			}
		}
		}
		return input;

	}
}
