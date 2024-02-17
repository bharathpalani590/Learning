package com.kodnest.julyjava;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
    Scanner scan=new Scanner(System.in);
    System.out.println("Enter the Number");
    int num=scan.nextInt();
    Amstrongnumber a1=new Amstrongnumber();
    int res=a1.AmsNum(num);
    if(res==num) {
    	System.out.println("Amstrong number");
    }
    else
    	System.out.println("Not Amstrong");
	}

}
