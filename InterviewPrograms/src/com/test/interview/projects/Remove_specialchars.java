package com.test.interview.projects;

class removespl{
	public void method5(String input5) {
		String temp = input5;
		input5 = input5.replaceAll("[^a-zA-Z0-9]", "");
		if(temp.equals(input5)) {
			System.out.println("No special characters");
		}else {
			System.out.println("New string is: "+input5);
		}
		
		
		
		
	}
}

public class Remove_specialchars {
	public static void main(String[] args) {
		removespl r2 = new removespl();
		r2.method5("sfdd$#dsdf");
		
	}

}
