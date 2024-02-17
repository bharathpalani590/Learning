package conditionif;

import java.util.Scanner;

public class ConditionIf {

	public static void main(String[] args) {
    Scanner scan=new Scanner(System.in);
    System.out.println("Enter a mark");
    int marks=scan.nextInt();
    System.out.println("Welcome to Kodnest");
    calculation(marks);
    scan.close();
	}
	public static void calculation(int marks)
	{
		if (marks>=80)
	    {
	    	System.out.println("Welcome to Tech club");
	    }
		
	}
}
