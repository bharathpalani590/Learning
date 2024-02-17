package com.kodnest.Controlconstructs;

import java.util.Scanner;

public class BoilerPlateCode {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter the purshaseamount");
		int purchaseAmount=scan.nextInt();
		checkDiscount(purchaseAmount);
	}
	public static void checkDiscount(double purchaseAmount)
	{
	if(purchaseAmount>=100) {
		System.out.println("Discount Applicable");
	}
	else
	{
		System.out.println("Not Applicable");
	}
	}

}
