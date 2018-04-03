package com.test.interview.projects;

public class Recursion_factorial {
	
	public static int recursivefact(int count) {
		if(count == 1) {
			return 1;
		}else {
			return(count * recursivefact(count - 1));
			
		}
	}
	
	public static void main(String[] args) {
		int a = 3;
		int x = recursivefact(a);
		System.out.println(x);
	}

}
