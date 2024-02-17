package com.kodnest.julyjava.Amstrong2;

public class Armstrong {
int armNumber(int num) {
	int digi=countDigi(num);
	int sum=0;
	while(num!=0) {
		int ld=num%10;
		int drp=(int) Math.pow(ld,digi);
		sum=sum+drp;
		num=num/10;
	}
	return sum;
}
int countDigi(int num) {
	int count=0;
	while(num!=0) {
	num=num/10;
	count++;
	}
	return count;
}
}
