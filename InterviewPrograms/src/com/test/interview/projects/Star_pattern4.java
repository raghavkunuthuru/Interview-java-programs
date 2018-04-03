package com.test.interview.projects;

import java.util.Scanner;

public class Star_pattern4 {
public static void main(String[] args) {
	System.out.println("Enter the Number: ");
	Scanner s1 = new Scanner(System.in);
	int input = s1.nextInt();
	int i,j;
	System.out.println("Pattern below: ");
	System.out.println();
	for(i=1; i <= input; i ++) {
		for(j=1; j<= input; j++) {
			if(i==1 || i == input || j==1 || j== input) {
				System.out.print("* ");
			}else {
			System.out.print("  ");
			}
		}
		System.out.println();
	}
	s1.close();
}
}
