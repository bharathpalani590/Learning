package com.kodnest.julyjava;

public class CountingDigi {
void countDigit(int num) {
	int count=0;
	int res=0;
	while(num!=0) 
	{
	 int ld=num%10;
	 res=res+ld;
	 num=num/10;
	 count++;
	}
	System.out.println(count);
   }
}
