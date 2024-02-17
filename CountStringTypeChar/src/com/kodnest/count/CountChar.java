package com.kodnest.count;

import java.util.Scanner;

public class CountChar {

	public static void main(String[] args) {
     Scanner scan=new Scanner(System.in);
     String str=scan.nextLine();
    count(str);
	}
    public static void count(String str)
    {
    	int vc=0;
    	int sc=0;
    	int dc=0;
    	int cc=0;
    	char arr[]=str.toCharArray();
    	for(int i=0;i<=str.length()-1;i++)
    	{
            char c=arr[i];
    		if(!Character.isDigit(str.charAt(i)))
    		{
    			if(c>=65 && c<=90 || c>=97 && c<=122)
    			{
    			if(c=='a'||c=='e'||c=='i'||c=='o'||c=='u'||c=='A'||c=='E'||c=='I'||c=='O'||c=='U')
    			{
    			 vc++;
    			}
    			else
    			{
    				cc++;
    			}
    			}
    			else
    			{
    				sc++;
    			}
    		}
    		else
    		{
    			dc++;
    		}
    	}
    	System.out.println(vc+" "+dc+" "+cc+" "+sc);
    }
}
