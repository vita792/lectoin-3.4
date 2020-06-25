package com.company.lesson4;

import java.util.Scanner;
public class Main
{
	public static void main(String[] args) {
	   int summ = 0;
	   Scanner arrSize = new Scanner (System.in);
	   System.out.print("Enter size for array: ");
	   int size = arrSize.nextInt();
	   int[] arrOfNumb = new int[size];
	   System.out.println("Enter array`s numbers: ");
	   for (int i = 0; i < arrOfNumb.length; i++){
	       arrOfNumb[i] = arrSize.nextInt();
	       }
	       for ( int number : arrOfNumb) {
	           summ += number;
	       }
	  System.out.println("Array`s numbers (summ): " + summ);
	   
    
	}    
}
