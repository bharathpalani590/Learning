import java.util.Scanner;

public class Arrays2 
{

	public static void main(String[] args) 
	{
	   Scanner scan=new Scanner(System.in);
	   float arr[][]=new float[4][];
	   arr[0]=new float[4];
	   arr[1]=new float[2];
	   arr[2]=new float[3];
	   arr[3]=new float[1];
	   for(int i=0;i<=arr.length-1;i++)
	   {
		   for(int j=0;j<=arr[i].length-1;j++)
		   {
			   System.out.println("Enter the "+i+"game palyer"+j);
			   arr[i][j]=scan.nextFloat();
		   }
		   
	   }
	   System.out.println("Player heights are...");
	   for(int i=0;i<=arr.length-1;i++)
	   {
		  
		   for(int j=0;j<=arr[i].length-1;j++)
		   {
			   System.out.print(arr[i][j]+"|");
		   }
		   System.out.println();
		   }
	   
	}

}
