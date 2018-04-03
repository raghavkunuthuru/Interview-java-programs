package com.test.interview.projects;

import java.util.Scanner;

public class Recursion_fibnoc {
	static int n1=1, n2=1, n3 = 0;
	public static void recursion_fibno(int count) {
		if(count > 0) {
			n3 = n2+n1;
			System.out.print(n3+" ");
			n1=n2;
			n2=n3;
			recursion_fibno(count-1);
			
					
		}
	}
	
	public static void main(String[] args) {
		
		Scanner s1 = new Scanner(System.in);
		System.out.println("Enter the input value");
		int input1 = s1.nextInt();
		System.out.print(n1+" "+n2+ " ");
		recursion_fibno(input1-2);
		s1.close();
		
	}

}
