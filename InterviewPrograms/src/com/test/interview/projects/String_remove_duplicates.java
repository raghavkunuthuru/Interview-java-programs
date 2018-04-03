package com.test.interview.projects;

import java.util.Scanner;

public class String_remove_duplicates {
public static void main(String[] args) {
	Scanner s2 = new Scanner(System.in);
	System.out.println("enter words to where duplicates to be removed: ");
	String input2 = s2.nextLine();
	
	//sorting of words
	//Sorting_Strings_bubble sort1 = new Sorting_Strings_bubble();
	sortingstring sortedarray = new sortingstring();
	String sortedarray1[] = sortedarray.sortingstrings(input2);
	System.out.println();
	int length1 = sortedarray1.length;
	String[] uniquearray = new String[length1+30];
	int k = 0;
	for(int i = 0; i < length1; i++) {
		if (sortedarray1[i].compareTo(sortedarray1[i+1])!= 0){
			uniquearray[k++] = sortedarray1[i];
		}
	}
	System.out.println("Final sorted array is : ");
	for(String unique : uniquearray) {
		System.out.print(unique+" ");
	}
	s2.close();
}
}
