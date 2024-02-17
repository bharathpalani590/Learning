package com.AddTwoArrayContents;

import java.util.Scanner;

public class AddTwoArrayContents {

	public static void main(String[] args) {
    Scanner scan=new Scanner(System.in);
    System.out.println("Enter 2Dimensional Array1 Lengths");
    int m=scan.nextInt();
    int n=scan.nextInt();
    int arr[][]=new int[m][n];
    System.out.println("Enter the Array1 Elements");
    for(int i=0;i<=arr.length-1;i++)
    {
    	for(int j=0;j<=arr[i].length-1;j++)
    	{
    		arr[i][j]=scan.nextInt();
    	}
    	System.out.println();
    }
    System.out.println("Array1 Contents are");
    for(int i=0;i<=arr.length-1;i++)
    {
    	for(int j=0;j<=arr[i].length-1;j++)
    	{
    		System.out.print(arr[i][j]+" ");
    	}
    	System.out.println();
    }
    int arr2[][]=new int[m][n];
    System.out.println("Enter Array2 Elements");
    for(int i=0;i<=arr2.length-1;i++)
    {
    	for(int j=0;j<=arr2[i].length-1;j++)
    	{
    		arr2[i][j]=scan.nextInt();
    	}
    	System.out.println();
    }
    System.out.println("Array2 Contents are");
    for(int i=0;i<=arr2.length-1;i++)
    {
    	for(int j=0;j<=arr2[i].length-1;j++)
    	{
    		System.out.print(arr2[i][j]+" ");
    	}
    	System.out.println();
    }
    int arr3[][]=new int[m][n];
    for(int i=0;i<=arr3.length-1;i++)
    {
    	for(int j=0;j<=arr3[i].length-1;j++)
    	{
    	arr3[i][j]=arr[i][j]+arr2[i][j];	
    	}
    }
    System.out.println("Addition of Two Array");
    for(int i=0;i<=arr3.length-1;i++)
    {
    	for(int j=0;j<=arr3[i].length-1;j++)
    	{
    	arr3[i][j]=arr[i][j]+arr2[i][j];	
    	}
    }
    for(int i=0;i<=arr3.length-1;i++)
    {
    	for(int j=0;j<=arr3[i].length-1;j++)
    	{
    		System.out.print(arr3[i][j]+" ");
    	}
    	System.out.println();
    }
 }
}
