package com.test.interview.projects;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Regular_expression_line {
	public static void main(String[] args) {
		System.out.println("Enter input:");
		Scanner s3 = new Scanner(System.in);
		String input4 = s3.nextLine();
		String test = "Hi hello this is raghav test";
		Pattern p1 = Pattern.compile(input4);
		Matcher m1 = p1.matcher(test);
		while(m1.find()) {
			System.out.println("string found: ");
			System.out.println(m1.group(0));
		}
		s3.close();
	}

}
