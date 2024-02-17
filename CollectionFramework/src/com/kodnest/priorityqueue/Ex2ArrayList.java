package com.kodnest.priorityqueue;

import java.util.ArrayList;

public class Ex2ArrayList {

	public static void main(String[] args) {
		ArrayList al = new ArrayList();
		al.add(10);
		al.add("yashu");
		al.add("Bharath");
		al.add(30);
		al.add(40);
		if(al.contains("yashu"))
		{
			System.out.println(al);
		}
		al.remove(0);
		
	}

}
