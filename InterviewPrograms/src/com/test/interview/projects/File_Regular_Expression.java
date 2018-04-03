package com.test.interview.projects;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class File_Regular_Expression {
	public static void main(String[] args) throws IOException {
		FileReader f1 = new FileReader("/Users/venkatraghav/Downloads/inputs/sampleinput.txt");
		BufferedReader b1 = new BufferedReader(f1);
		String line = b1.readLine();
		int counter = 0, flag = 0;
		System.out.println("Enter regex patter to be verified");
		Scanner s1 = new Scanner(System.in);
		String regexpattern = s1.nextLine();
		while(line != null) {
			Pattern p1 = Pattern.compile(regexpattern);
			Matcher m1 = p1.matcher(line);
			while(m1.find()) {
				counter = counter+1;
				flag = 1;
				System.out.println("Regex pattern found on line: "+counter);
				//break;
			}
			
			line = b1.readLine();
		}
		
		if(flag == 0) {System.out.println("Pattern not found");}
		b1.close();
		s1.close();
	}

}
