package com.CopyingArrayContents;

import java.util.Scanner;

public class CopyArrayContents {

	public static void main(String[] args) {
    Scanner scan=new Scanner(System.in);
    System.out.println("Enter 2dimensional Array lengths");
    int m=scan.nextInt();
    int n=scan.nextInt();
    int arr[][]=new int[m][n];
    System.out.println("Enter Array Elements");
    for(int i=0;i<=arr.length-1;i++)
    {
    	for(int j=0;j<=arr[i].length-1;j++)
    	{
    	arr[i][j]=scan.nextInt();
    	}
    	System.out.println();
    }
    System.out.println("Array Contents Before Copying");
    for(int i=0;i<=arr.length-1;i++)
    {
    	for(int j=0;j<=arr[i].length-1;j++)
    	{
    	System.out.print(arr[i][j]+" ");
    	}
    	System.out.println();
    }
    int arr2[][]=new int[m][n];
    for(int i=0;i<=arr.length-1;i++)
    {
    	for(int j=0;j<=arr[i].length-1;j++)
    	{
    		arr2[i][j]=arr[i][j];
    	}
    }
    System.out.println("Array contents after copying");
    for(int i=0;i<=arr.length-1;i++)
    {
    	for(int j=0;j<=arr[i].length-1;j++)
    	{
    		System.out.print(arr2[i][j]+" ");
    	}
    	System.out.println();
    }
 }
}
