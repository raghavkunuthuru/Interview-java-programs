package com.test.interview.projects;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

public class File_word_find_line {

	public static void main(String[] args) throws IOException {
		FileReader f2 = new FileReader("/Users/venkatraghav/Downloads/inputs/sampleinput.txt");
		BufferedReader b2 = new BufferedReader(f2);
		String line = b2.readLine();
		int counter = 0;
		int flag = 0;
		System.out.println("Enter find word: ");
		Scanner s1 = new Scanner(System.in);
		String findword = s1.nextLine();
		while (line != null) {
			counter = counter + 1;
			if (line.contains(findword)) {
				System.out.println("Word present in line:" + counter);
				flag =1;
			}
			line = b2.readLine();
		}
		if (flag==0) {
			System.out.println("Word not present");
			
		}
		s1.close();
		b2.close();
	}

}
