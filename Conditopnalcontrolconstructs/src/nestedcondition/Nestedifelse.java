package nestedcondition;

public class Nestedifelse
{

	public static void main(String[] args) 
 {
    int x=-15;
    int y=-20;
    if(x>0)
    {
    	System.out.println("X is positive");
    	{
    		if(y>0)
    		{
    		 System.out.println("y is positive");
    		}
    		else
    		{
    		 System.out.println("y is negative");
    		}
    	}
    }
    else
      System.out.println("x is negative");
 }

}
