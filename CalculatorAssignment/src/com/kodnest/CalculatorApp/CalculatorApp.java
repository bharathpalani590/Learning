package com.kodnest.CalculatorApp;

import java.util.Scanner;

public class CalculatorApp {

	public static void main(String[] args) {
	try {
    System.out.println("Calculation is Started");
    Scanner scan=new Scanner(System.in);
    System.out.println("Enter the First number");
    int a=scan.nextInt();
    System.out.println("Enter the Second number");
    int b=scan.nextInt();
    head(a,b);
    sub(a,b);
	mul(a,b);
	div(a,b);
		}
		catch(Exception e)
		{
             System.out.println("Exception is handled in main()");
		}
		System.out.println();
	}
	public static void head(int a,int b)throws Exception
	{
		System.out.println("Addition result is: "+(a+b));
	}
	public static void sub(int a,int b)
	{
		try {
			System.out.println("Subtraction result is: "+(a-b));
			}
			catch(Exception e)
			{
				System.out.println("Exception is handled in sub()");
			}

		System.out.println("Subtraction is Ended");
	}
	public static void mul(int a,int b)
	{
		try {
			System.out.println("Multiplication result is: "+(a*b));
			}
			catch(Exception e)
			{
				System.out.println("Exception is handled in mul()");
			}

		System.out.println("Multiplication  is Ended");
	}
	public static void div(int a,int b)throws Exception
	{
		try {
		System.out.println("Addition result is: "+(a/b));
		}
		catch(Exception e)
		{
			System.out.println("Exception is handled in div()");
			throw e;
		}
		finally
		{
		System.out.println("Division is ended");
		}
	}
    
}
