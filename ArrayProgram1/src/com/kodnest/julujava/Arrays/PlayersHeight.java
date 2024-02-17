package com.kodnest.julujava.Arrays;

import java.util.Scanner;

public class PlayersHeight {

	public static void main(String[] args) {
		Scanner scan= new Scanner(System.in);
	    float height[]=new float[2];
	    for(int i=0;i<height.length;i++)
	    {
	    	System.out.println("Enter Player Height");
	    	height[i]=scan.nextFloat();
	    }
	    System.out.println("Array Players Height ");
	    for(int i=0;i<height.length;i++)
	    {
	    	System.out.print(height[i]+" ");
	    }
	    scan.close();
	}

}
