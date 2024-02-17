package com.kodnest.julyjava;

import java.util.Scanner;

public class Main {
	public static void categorizeAge(int age)

	{
     if(age>0 && age<=12)
     {
    	System.out.println("child"); 
     }
     else if(age>=13 && age<=19)
     {
    	 System.out.println("Teen");
     }
     else if(age>=20 && age<=59)
     {
    	 System.out.println("Adult");
     }
     else if(age>60)
     {
    	 System.out.println("senior");
     }

	}

	public static void main(String[] args)

	{
     Scanner scan=new Scanner(System.in);
     int age=scan.nextInt();
     categorizeAge(age);
	}

}


