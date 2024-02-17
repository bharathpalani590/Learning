package com.conditionalconstructs.elseifladder;

import java.util.Scanner;

public class Score {

	public static void main(String[] args) {
    Scanner scan=new Scanner(System.in);
    System.out.println("Enter your score");
    int score=scan.nextInt();
    ScoreApp s1=new ScoreApp();
    s1.grade(score);
    scan.close();
	}

}
