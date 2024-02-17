package com.homework;

public class Quiz6 {

	public static void main(String[] args) {
    int num=2;
    String result="";
    switch(num)
    {
    case 1:
    	result=result+"One";
    case 2:
    	result=result+"2";
    case 3:
    	result=result+"3";
    default:
    	result=result+"default";
    }
    System.out.println(result);
	}

}
