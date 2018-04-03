package com.test.interview.projects;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;

public class File_unique_words {
	public static void main(String[] args) throws IOException {
		//FileInputStream f1 = new FileInputStream("/Users/venkatraghav/Downloads/sampleinput.txt");
		FileReader f1 = new FileReader("/Users/venkatraghav/Downloads/sampleinput.txt");
		BufferedReader br = new BufferedReader(f1);
		//HashMap<String, Integer> hm1 = new HashMap<>();
		//String line;
		ArrayList<String> arr1 = new ArrayList<>();
		String currentline = br.readLine();
		while(currentline != null) {
			String words[] = currentline.split(" ");
			for(String word: words) {
				arr1.add(word);
			}
			
			currentline = br.readLine();
		}
		for(String fullwords: arr1) {
			System.out.println(fullwords);
		}
		Collections.sort(arr1);
		/*HashSet<String> hs1 = new HashSet<>();
		arr1.addAll(hs1);
		//removing duplicates
		System.out.println("After removing duplicates");
		for(String hs: hs1) {
			System.out.print(hs+" ");
		}*/
		System.out.println("After sorting elements");
		for(String fullwords: arr1) {
			System.out.println(fullwords);
		}
		System.out.println("After removing duplicate elements");
		for(int k =0; k < arr1.size();k++) {
			if(arr1.get(k).compareTo(arr1.get(k+1)) == 0){
				arr1.remove(k);
			}
		}
		for(String fullwords: arr1) {
			System.out.print(fullwords+" ");
		}
		
		
		br.close();
	}

}
