package com.test.interview.projects;

 class stringreversal {
	
	public void method1(String input1) {
		StringBuilder s1 = new StringBuilder(input1);
		s1.reverse();
		String temp = s1.toString();
		if (input1.equals(temp)) {
			System.out.println("string is palindrome");
		}
		else
		{ System.out.println("string is not palindrome");}
		
	}

}

public class String_Reversal {
	public static void main(String[] args) {
		stringreversal s1 = new stringreversal();
		s1.method1("test");
		String new1 = args[0];
		s1.method1(new1);
		
		//System.out.println(stringreversal.method1("esse"));
		
	}
}
