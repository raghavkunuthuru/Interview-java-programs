package com.test.interview.projects;

public class Given_Word_occurence {
	
	public static void occurence(String input, String occurenceword) {
		int counter = 0;
		String lowercaseword = occurenceword.toLowerCase();
		String words[] = input.split(" ");
		for(String word: words) {
			if(word.equals(lowercaseword)) {
				counter = counter + 1;
				
			}
		}
		System.out.println("word **"+occurenceword+"** appeared times: "+counter);
		
	}
	
	
public static void main(String[] args) {
	occurence("test string in going hyderabad", "Hyderabad");
	
}
}
