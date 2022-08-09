package arrays;

import java.util.Random;

public class _00_ArrayCheatSheet {
	public static void main(String[] args) {
		Random r = new Random();
		int low = 0;
		int high = 0;
		
		
		
		//1. make an array of 5 Strings
		String []a = new String[5];

		//2. print the third element in the array
		System.out.println(a[2]);
		//3. set the third element to a different value
		a[2] = "Troy";
		//4. print the third element again
		System.out.println(a[2]);
		//5. use a for loop to print all the values in the array
		System.out.println("--------------");
		//   BE SURE TO USE THE ARRAY'S length VARIABLE
	   for (int i=0; 5>i; i++) {
		   System.out.println(a[i]);
	   }
		
		//6. make an array of 50 integers
	   //sike, do 10, this is part of the original unedited version
		int []b = new int[10];
		//7. use a for loop to make every value of the integer array a random number
		for (int j=0; 10>j; j++) {
			b[j] = r.nextInt();
		}
		for (int k=0; 10>k; k++) {
			if(b[k] > high) {
				high = b[k];
			}
			if(b[k] < low) {
				low = b[k];
			}
		}
		System.out.println("---------");
		//8. without printing the entire array, print only the smallest number in the array
		System.out.println(high + ", " + low);
		//9 print the entire array to see if step 8 was correct
		System.out.println("-------------");
		for (int t=0; 10>t; t++) {
			System.out.println(b[t]);
		}
		//10. print the largest number in the array.
	}
}
