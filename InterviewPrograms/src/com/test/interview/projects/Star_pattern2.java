package com.test.interview.projects;

public class Star_pattern2 {
public static void main(String[] args) {
	int i, j;
	int input = 5;
	for(j=1; j<=input; j++) {
	for(i = input; i>=j; i --) {
		System.out.print("*"+" ");
	}
	System.out.println();
	}
}
}
