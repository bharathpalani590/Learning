package com.kodnest.priorityqueue;

import java.util.LinkedList;

public class LinkedListUsingGenerics {

	public static void main(String[] args) {
    LinkedList<Boolean> ll=new LinkedList<Boolean>();
    ll.add(true);
    ll.add(false);
    ll.add(true);
    ll.add(false);
    ll.add(true);
    System.out.println(ll);
	}

}
