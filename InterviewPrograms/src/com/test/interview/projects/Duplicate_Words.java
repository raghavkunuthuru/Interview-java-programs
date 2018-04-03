package com.test.interview.projects;

import java.util.HashMap;


class duplicatewords{
	public void dupmethod(String input5) {
		String temp = input5;
		HashMap<String, Integer> hm1 = new HashMap<String,Integer>();
		String words[] = temp.split(" ");
		for(String word: words) {
			if(hm1.containsKey(word)) {
				hm1.put(word, hm1.get(word)+1);
			}else {
				hm1.put(word, 1);
			}
		}
		
	}
	
}







public class Duplicate_Words {
	public static void main(String[] args) {
		duplicatewords d1 =new duplicatewords();
		d1.dupmethod("test one one test two test three");
		
	}

}
