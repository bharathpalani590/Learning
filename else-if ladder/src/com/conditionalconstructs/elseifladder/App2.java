package com.conditionalconstructs.elseifladder;

import java.util.Scanner;

public class App2 {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
	    System.out.println("Enter your score");
	    int score=scan.nextInt();
	    App2 g2=new App2();
	    g2.grade(score);
	    scan.close();
	}
	void grade(int score) {
		if(score>=90)
    	{
    		System.out.println("A+ Grade");
    	}
    	else if(score>=80 && score<90)
    	{
    		System.out.println("A Grade");
    	}
    	else if(score>=70 && score<80)
    	{
    		System.out.println("B Grade");
    	}
    	else if(score>=60 && score<70)
    	{
    		System.out.println("C Grade");
    	}
    	else if(score>=50 && score<60)
    	{
    		System.out.println("D Grade");
    	}
    	else 
    	{
    		System.out.println("You are Fail");
    	}
	}


}
