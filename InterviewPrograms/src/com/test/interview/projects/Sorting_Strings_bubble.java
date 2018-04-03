package com.test.interview.projects;

import java.util.Scanner;

class sortingstring {
	public String[] sortingstrings(String input1) {
		String[] words = input1.split(" ");
		int length = words.length;
		String temp = null;
		for(int i =0; i < length; i ++) {
			for(int j =1; j < length - i; j++) {
				if(words[j-1].compareTo(words[j]) > 0) {
					temp = words[j-1];
					words[j-1] = words[j];
					words[j] = temp;
				}
			}
		}
		System.out.println("Sorted words");
		for(String sortword: words) {
			System.out.print(sortword+" ");
		}
		return words;
	}
	
}

public class Sorting_Strings_bubble {
	
public static void main(String[] args) {
	Scanner s1 = new Scanner(System.in);
	System.out.println("Enter words to sort with:");
	String input1 = s1.nextLine();
	sortingstring sortingstring1 = new sortingstring();
	sortingstring1.sortingstrings(input1);
	s1.close();
	
}
}
