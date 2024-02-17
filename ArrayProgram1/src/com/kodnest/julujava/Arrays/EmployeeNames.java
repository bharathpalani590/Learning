package com.kodnest.julujava.Arrays;

import java.util.Scanner;

public class EmployeeNames {

	public static void main(String[] args) {
		Scanner scan= new Scanner(System.in);
	    String name[]=new String[8];
	    for(int i=0;i<name.length;i++)
	    {
	    	System.out.println("Enter Name");
	    	name[i]=scan.next();
	    }
	    System.out.println("Array Names ");
	    for(int i=0;i<name.length;i++)
	    {
	    	System.out.print(name[i]+" ");
	    }
	}

}
