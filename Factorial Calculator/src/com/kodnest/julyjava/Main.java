package com.kodnest.julyjava;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
    Scanner scan=new Scanner(System.in);
    int n=scan.nextInt();
    calculateFactorial(n);
	}
	public static void calculateFactorial(int n)

	{
     int mul=1;
     for(int i=1;i<=n;i++) {
    	 mul=mul*i;
     }
     System.out.println(mul);

	}
}
