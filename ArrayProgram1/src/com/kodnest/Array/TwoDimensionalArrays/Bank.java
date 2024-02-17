package com.kodnest.Array.TwoDimensionalArrays;

import java.util.Scanner;

public class Bank {

	public static void main(String[] args) {
		Scanner scan= new Scanner(System.in);
	    String room[][]=new String[1][5];
	    for(int i=0;i<room.length;i++)
	    {
	    	for(int j=0;j<room[i].length-1;j++) {
	    	System.out.println("Enter the room "+i+"Name is "+j);
	    	room[i][j]=scan.next();
	    }
	    }
	    System.out.println("Array names are... ");
	    for(int i=0;i<room.length;i++)
	    {
	    	for(int j=0;j<room[i].length-1;j++) 
	    	{
	    	System.out.print(room[i][j]+" | ");
	        }
	    	System.out.println();
	    }
	}

}
