package com.test.interview.projects;

import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedList;

public class LInked_list_reversal {
		
public static void main(String[] args) {
	
	LinkedList<Integer> l1 = new LinkedList<>();
	l1.add(1);
	l1.add(5);
	l1.add(3);
	l1.add(7);
	//printing linked list values
	System.out.println("Before reversing of linked list");
	Iterator<Integer> itr = l1.iterator();
	while(itr.hasNext()) {
		System.out.println(itr.next());
	}
	System.out.println("printing by for loop");
	for(int x: l1) {
		System.out.println(x);
	}
	Collections.reverse(l1);
	System.out.println("printing after reverse");
	for(int m : l1) {
		System.out.println(m);
	}
	
	
}
}
