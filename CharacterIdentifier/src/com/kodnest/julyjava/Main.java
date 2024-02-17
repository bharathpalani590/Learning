package com.kodnest.julyjava;

import java.util.Scanner;

public class Main {
	public static void identifyCharacter(char ch)
	{
	switch(ch) {
	case 'a':System.out.println("lower-case vowel");
	break;
	case 'A':System.out.println("upper-case vowel");
	break;
	case 'b':System.out.println("lower-case consonant");
	break;
	case 'B':System.out.println("upper-case consonant");
	break;
	case '1':System.out.println("digit");
	break;
	case '@':System.out.println("special character");
	break;
	default:System.out.println("Nothing");
	}
	}
	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		char a=scan.next().charAt(0);
		Character ch=Character.valueOf(a);
		identifyCharacter(ch);
		scan.close();
	}

}
//if(ch=='a'||'e'||'i'||'o'||'u') {