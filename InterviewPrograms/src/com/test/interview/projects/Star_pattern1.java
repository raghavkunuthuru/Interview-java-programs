package com.test.interview.projects;

public class Star_pattern1 {
	public static void main(String[] args) {
		int input = 5;
		for(int i=0; i< input; i ++) {
			for(int j=0; j<=i; j++) {
				System.out.print(j+1+" ");
			}
			System.out.println();
		}
	}

}
