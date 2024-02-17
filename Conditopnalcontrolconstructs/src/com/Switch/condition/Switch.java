package com.Switch.condition;

import java.util.Scanner;

public class Switch {

	public static void main(String[] args) {
	Scanner scan=new Scanner(System.in);
	System.out.println("Enter num between 1-7");
	int num=scan.nextInt();
	scan.close();
	Switch n1=new Switch();
	n1.day(num);
	}
	void day(int num) {
    switch(num) 
    {
    	case 1:
    		System.out.println("MONDAY");
    		break;
    	case 2:
    		System.out.println("TUESDAY");
    		break;
    	case 3:
    		System.out.println("WEDNESDAY");
    		break;
    	case 4:
    		System.out.println("THURSDAY");
    		break;
    	case 5:
    		System.out.println("FRIDAY");
    		break;	
    	case 6:
    		System.out.println("SATDAY");
    		break;
    	case 7:
    		System.out.println("SUNDAY");
    		break;
    	default:
    		System.out.println("Go and see the statement clearly");
    }
	
	}
}
