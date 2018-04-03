package com.test.interview.projects;

public class Given_character_occurence {
	public static void charoccurence(String input, String input1) {
		int counter = 0;
		String characters1[] = input.split("");
		for (String chars : characters1) {
			if (chars.equals(input1)) {
				counter = counter + 1;
			}
		}
		System.out.println(input1+"  " +counter);

	}

	public static void main(String[] args) {
		charoccurence("i am going to hyderabad i am at hyderabad", "a");

	}

}
