package com.test.interview.projects;

public class Star_pattern3 {
	public static void main(String[] args) {
		int i, j, k;
		int input = 5;
		for (i = 1; i <= input; i++) {
			for (k = 1; k <= (input-i); k++) {
				System.out.print("  ");
			} 
			for (j = 1; j <= i; j++) {
				System.out.print("* ");
			}

			System.out.println();
		}

	}
}
