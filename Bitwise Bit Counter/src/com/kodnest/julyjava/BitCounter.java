package com.kodnest.julyjava;

import java.util.Scanner;

public class BitCounter {

	public static void main(String[] args) {
    Scanner scan=new Scanner(System.in);
    System.out.println("Enter an integer:");
    int integer=scan.nextShort();
    countSetBits(integer);
    scan.close();
	}
    public static void countSetBits(int i)
    {
    	System.out.println(Integer.toBinaryString(i));
    	System.out.println("Number of set bits:"+Integer.bitCount(i));
    }
}
