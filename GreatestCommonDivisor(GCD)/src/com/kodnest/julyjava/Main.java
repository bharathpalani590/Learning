package com.kodnest.julyjava;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
    Scanner scan=new Scanner(System.in);
    System.out.println("Enter Number");
    int a=scan.nextInt();
    int b=scan.nextInt();
    findGCD(a,b);
    scan.close();
	}
	public static void findGCD(int a, int b)
	{
		while(b!=0) {
	    int rem=a%b;
	    a=b;
	    b=rem;
		}
		int GCD=a;
		int LCM=a*b/GCD;
		System.out.println(LCM);
		}
	}

