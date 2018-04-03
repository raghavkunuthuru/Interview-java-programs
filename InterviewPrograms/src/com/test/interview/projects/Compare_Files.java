package com.test.interview.projects;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class Compare_Files {
	public static void main(String[] args) throws IOException {
		FileReader ff1 = new FileReader("/Users/venkatraghav/Downloads/inputs/sampleinput.txt");
		FileReader ff2 = new FileReader("/Users/venkatraghav/Downloads/inputs/sampleinput1.txt");
		BufferedReader bb1 = new BufferedReader(ff1);
		BufferedReader bb2 = new BufferedReader(ff2);
		int flag = 0;
		String line1 = bb1.readLine();
		String line2 = bb2.readLine();
		while (line1 != null || line2 != null) {
			if (line1.equals(line2)) {
				//System.out.println("lines are equal");
				System.out.println(line1 + " " + line2);
			} else {
				flag = 1;
			}
			line2 = bb2.readLine();
			line1 = bb1.readLine();
		}
		if (flag == 1) {
			System.out.println("Files are not equal");
		}
		bb1.close();
		bb2.close();
	}
}
