package com.test.interview.projects;

class reversalwithoutfunc {
	public boolean reversalfunc(String input2) {
		//StringBuilder s2 = new StringBuilder(input2);
		String temp = input2;
		String temp2 = "";
		String splitstring[] = input2.split("");
		int i;
		for(i = splitstring.length -1; i >= 0; i --) {
			temp2 = temp2+ splitstring[i];
		}
		System.out.println("reversed string is: "+temp2);
		if(temp2.equals(temp)) {
			System.out.println("string is palindrome");
			return true;
		}
		else { System.out.println("not palindrome");
		return false;
		}
			
	}
}




public class String_reversal_without_func {
	public static void main(String[] args) {
		reversalwithoutfunc r1 = new reversalwithoutfunc();
		r1.reversalfunc("sees");
		
	}

}
