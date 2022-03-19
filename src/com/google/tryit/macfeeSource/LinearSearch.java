//Linear Search

package com.google.tryit.macfeeSource;

import java.util.Scanner;

public class LinearSearch{

   public static void main(String[] args){

       Scanner in = new Scanner(System.in);

       System.out.println("Enter the size of the array which should be greater than zero else it will throw InputMismatchException : ");

       int size = in.nextInt();

       int[] array = new int[size];

       System.out.println("Enter the elements of the array: ");

       for(int i=0; i<size; i++){  

           array[i] = in.nextInt();
       }

       System.out.println("Enter the search element: ");

       int s = in.nextInt();
       int i=0;
   for(; i<size; i++){
       if(s==array[i]){
               printArray(array);
           System.out.println("Element "+s+" found in the array.");
           break;
       }
   }   
  
   if(i==size){
        printArray(array);
        System.out.println("Element "+s+" is not found in the array.");
   }


   }
   public static void printArray(int[] a){

          System.out.println("Array of elements: ");

           System.out.print("{");

           for(int i:a){

               System.out.print(i+",");

           }

           System.out.println("}");

   }
}

/*Output:

Enter the size of the array which should be greater than zero else it will throw InputMismatchException :
6
Enter the elements of the array:
3
76
3
5
21
54
Enter the search element:
31
Array of elements:
{3,76,3,5,21,54,}
Element 31 is not found in the array.
*/