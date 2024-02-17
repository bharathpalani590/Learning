package com.kodnest.julyjava;

public class Amstrongnumber {
	int AmsNum(int num)
	{
    int res=digit(num);
    int lastdigit=0;
    while(num!=0) {
    int ld=num%10;
    int ld2=1;
    for(int i=1;i<=res;i++) {
    ld2=ld2*ld;
    }
    lastdigit=lastdigit+ld2;
     num=num/10;
   }
    return lastdigit;
}
   int digit(int num) 
   {
	   int count=0;
	int sum=0;
	while(num!=0)
	{
		int ld=num%10;
		sum=sum+ld;
		num=num/10;
		count++;
	}
	return count;
   }
   
}
