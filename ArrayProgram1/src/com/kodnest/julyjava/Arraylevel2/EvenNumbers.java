package com.kodnest.julyjava.Arraylevel2;

import java.util.Scanner;

public class EvenNumbers {

	public static void main(String[] args) {
    Scanner scan=new Scanner(System.in);
    System.out.println("Enter the length");
    int arr[]=new int[scan.nextInt()];
    for(int i=0;i<=arr.length-1;i++)
    {
    	arr[i]=scan.nextInt();
    }
    System.out.println("Print Even numbers");
    for(int i=0;i<=arr.length-1;i++)
    {
    	if(arr[i]%2==0)
    	{
    		System.out.print(arr[i]+" ");
    	}
    }
}

}
