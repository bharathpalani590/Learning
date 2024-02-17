package com.kodnest.MatrixMultiplication;

import java.util.Scanner;

public class ArrayMatrixmultiplication {

	public static void main(String[] args) {
    Scanner scan=new Scanner(System.in);
    System.out.println("Enterr 2D Array lengths");
    int m=scan.nextInt();
    int n=scan.nextInt();
    int arr[][]=new int[m][n];
    int arr2[][]=new int[m][n];
    int arr3[][]=new int[m][n];
    System.out.println("Enter arr1 Elements");
    for(int i=0;i<=arr.length-1;i++)
    {
    	for(int j=0;j<=arr[i].length-1;j++)
    	{
    		arr[i][j]=scan.nextInt();
        }
    }
    for(int i=0;i<=arr2.length-1;i++)
    {
    	for(int j=0;j<=arr2[i].length-1;j++)
    	{
    		arr2[i][j]=scan.nextInt();
        }
    
    }
   for(int i=0;i<=arr3.length-1;i++)
   {
	   for(int j=0;j<=arr3.length-1;j++)
	   {
		 
	   }
   }
   System.out.println("Array Matrix Multiplication");
   for(int i=0;i<=arr3.length-1;i++)
   {
	   for(int j=0;j<=arr3.length-1;j++)
	   {
		   System.out.print(arr3[i][j]+" ");
	   }
	   System.out.println();
   }
   
 }

}
