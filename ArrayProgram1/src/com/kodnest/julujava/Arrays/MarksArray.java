package com.kodnest.julujava.Arrays;

import java.util.Scanner;

public class MarksArray {

	public static void main(String[] args) {
		Scanner scan= new Scanner(System.in);
	    int mark[]=new int[5]; 
	    for(int i=0;i<mark.length;i++)
	    {
	    	System.out.println("Enter an Mark");
	    	mark[i]=scan.nextInt();
	    }
	    System.out.println("Student Marks");
	    for(int i=0;i<mark.length;i++)
	    {
	    	System.out.print(mark[i]+" ");
	    }
	}

}
