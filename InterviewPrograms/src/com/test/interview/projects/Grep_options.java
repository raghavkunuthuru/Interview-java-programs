package com.test.interview.projects;

public class Grep_options {
public static void main(String[] args) {
	String input1 = "Hello how        are          you";
	String words[] = input1.split("\\s+");
	for(String word: words) {
		System.out.println(word);
	}
	String input2 = "Hello 2323 hel45 42";
	//printing only numbers
	String words1[] = input2.split("\\D+");
	for(String word: words1) {
		System.out.println(word);
	}
}
}
