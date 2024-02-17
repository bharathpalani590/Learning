package com.kodnest.julujava.Arrays;

import java.util.Scanner;

public class Demo {

	public static void main(String[] args) {
    Scanner scan= new Scanner(System.in);
    int arr[]=new int[3]; 
    for(int i=0;i<arr.length;i++)
    {
    	System.out.println("Enter an Element");
    	arr[i]=scan.nextInt();
    }
    System.out.println("Array contents are....");
    for(int i=0;i<arr.length;i++)
    {
    	System.out.print(arr[i]+" ");
    }
	}

}
