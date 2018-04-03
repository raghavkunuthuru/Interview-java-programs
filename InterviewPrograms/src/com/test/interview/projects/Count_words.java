package com.test.interview.projects;

public class Count_words {

	public static int countword(String input1) {
		String words[] = input1.split(" ");
		int counter = 0;
		for(String word: words) {
			counter = counter+1;
			System.out.println(word);
		}
		System.out.println("number of words: "+ counter);
		return counter;
	}
	
	public static void main(String[] args) {
		int countmain;
		countmain = countword("test word is eclipse");
		System.out.println("count in main: "+countmain);
	}
}
