package com.ArrayRotation;

import java.util.Scanner;

public class ArrayRotation {

	public static void main(String[] args) {
    Scanner scan=new Scanner(System.in);
    System.out.println("Enter the array length");
    int arr[]=new int[scan.nextInt()];
    for(int i=0;i<=arr.length-1;i++)
    {
    	arr[i]=scan.nextInt();
    }
    System.out.print("Array Contents are -->");
    for(int i=0;i<=arr.length-1;i++)
    {
    	System.out.print(arr[i]+" ");
    }
    System.out.println();
    System.out.println("Enter Number of AnticlockWise Rotation");
    int n=scan.nextInt();
    for(int j=1;j<=n;j++)
    {
    int temp=arr[0];
    for(int i=1;i<=arr.length-1;i++)
    {
    	
    	arr[i-1]=arr[i];
    	
    }
    arr[arr.length-1]=temp;
    }
    System.out.print("Array After AnticlockWise Rotation --> ");
    for(int i=0;i<=arr.length-1;i++)
    {
    	System.out.print(arr[i]+" ");
    }
 }
}
