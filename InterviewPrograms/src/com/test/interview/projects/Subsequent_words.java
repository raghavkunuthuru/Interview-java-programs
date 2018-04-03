package com.test.interview.projects;

class subwords{
	public void method3(String input4) {
		String temp = input4;
		int i, flag = 0;
		String splitwords[] = temp.split("");
		for(i=0 ; i <splitwords.length -1 ; i ++) {
			//System.out.println("loop: "+splitwords[i]);
			if(splitwords[i].equals(splitwords[i+1])) {
				System.out.println("repeated string is: "+splitwords[i]);
				flag = 1;
			}
	
			}
		if (flag ==0) {
			System.out.println("No character repeated");
		}
			
		}
	}

public class Subsequent_words {
	public static void main(String[] args) {
		subwords s3 = new subwords();
		s3.method3("sessekskkkss");
		
	}

}
