package com.kodnest.julyjava.Amstrong2;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
    Scanner scan= new Scanner(System.in);
    System.out.println("Enter the number");
    int num=scan.nextInt();
    Armstrong arm=new Armstrong();
    int ans=arm.armNumber(num);
    scan.close();
    if(num==ans) {
    	System.out.println("Amstrong Number");
    }
    else
    	System.out.println(ans+" is Not Amstrong Number");
	}

}
