//Transpose of Matrix

package com.google.tryit.macfeeSource;

	 import java.util.Scanner;

	 public class TransposeOfMatrix {
	     public static void main(String[] args) {
	         Scanner in = new Scanner(System.in);
	         System.out.println("enter the number of rows: ");
	         int r = in.nextInt();
	         System.out.println("enter the number of columns: ");
	         int c = in.nextInt();
	         int[][] m = new int[r][c];
	         getNumOfMatrix(in,r,c,m);
	         transpose(r, c,m);
	     }
	     public static int[][] getNumOfMatrix(Scanner in, int r, int c, int[][] m){
	         System.out.println("Enter the elements of matrix: ");
	         for(int i=0; i<r; i++){
	             for(int j=0; j<c; j++){
	                 m[i][j] = in.nextInt();
	             }
	         }
	         return m;
	     }

	     public static void transpose(int r, int c, int[][] m){
	         int[][] transpose = new int[c][r];
	         for(int i=0; i<r; i++){
	             for(int j=0; j<c; j++){
	                 transpose[j][i] = m[i][j];
	             }
	         }
	         System.out.println("Matrix which need to tranpose: ");
	         printMatrix(m);
	         System.out.println("Transpose Matrix: ");
	         printMatrix(transpose);
	     }
	     public static void printMatrix(int[][] m){
	         for(int[] i: m){
	             for(int j: i){
	                 System.out.print(" "+j);
	             }
	             System.out.println();
	         }
	     }
	 }
/*	 Output-
	 enter the number of rows:
	 3
	 enter the number of columns:
	 2
	 Enter the elements of matrix:
	 1
	 2
	 3
	 4
	 5
	 6
	 Matrix which need to tranpose:
	  1 2
	  3 4
	  5 6
	 Transpose Matrix:
	  1 3 5
	  2 4 6*/