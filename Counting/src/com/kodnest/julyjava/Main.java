package com.kodnest.julyjava;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
    Scanner scan=new Scanner(System.in);
    System.out.println("Enter the Number");
    int num=scan.nextInt();
    new CountingDigi().countDigit(num);
	}

}
