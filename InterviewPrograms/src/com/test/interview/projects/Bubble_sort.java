package com.test.interview.projects;


class bubblesort{
	public void bubblsorting(int a[]) {
		int length = a.length,i,j,temp;
		//printing array
		for(int k: a) {
			System.out.print(k+" ");
		}
		//sorting
		System.out.println("Sorting of array:");
		
		for(i = 0; i < length; i ++) {
			for(j=1; j < length-i;j++) {
				if(a[j-1] > a [j] ) {
					temp = a[j-1];
					a[j-1] = a[j];
					a[j] = temp;
				}
				
			}
		}
		for(int m : a) {
			System.out.println(m+" ");
		}
		System.out.println("printing the third largest: "+ a[length - 3]);
	}
	
}


public class Bubble_sort {
	public static void main(String[] args) {
		bubblesort b1 = new bubblesort();
		int a[] = {1,3,9,0,4,8};
		b1.bubblsorting(a);
		//Added extra line
		//Added second line
	}

}
