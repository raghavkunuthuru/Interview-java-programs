package com.test.interview.projects;

import java.util.Scanner;

public class Scanner_example {
	
	public static void main(String[] args) {
		Scanner s1 = new Scanner(System.in);
		System.out.println("enter input1:");
		String input1  = s1.nextLine();
		System.out.println(input1);
		System.out.println("enter input2:");
		int val2 = s1.nextInt();
		System.out.println(val2);
		s1.close();
	}

}
