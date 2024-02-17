package question.five;

import java.util.Scanner;

public class BitwiseXOR {

	public static void main(String[] args) {
    Scanner scan=new Scanner(System.in);
    System.out.println("Enter the first integer:");
    int f1=scan.nextInt();
    System.out.println("Enter the second integer:");
    int f2=scan.nextInt();
    scan.close();
    swapUsingBitwise(f1,f2);
	}
	public static void swapUsingBitwise(int s1,int s2) {
     s1=s1^s2;
     s2=s1^s2;
     s1=s1^s2;
     System.out.println("After Swapping:First=" +s1+ ",Second=" +s2);
	}

}
