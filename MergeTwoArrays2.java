
// Java Program to demonstrate merging
// two array without using pre-defined method

import java.io.*;

public class MergeTwoArrays2 {
	public static void main(String[] args)
	{

		
		int a[] = {1,2,3,4,5};        // first array
		
		int b[] = { 6,7,8,9,10 };  // second array

		int a1 = a.length;                     // determining length of first array
		
		int b1 = b.length;                     // determining length of second array

		int c1 = a1 + b1;                           // resultant array size

		int[] c = new int[c1];                // Creating a new array

		for (int i = 0; i < a1; i++) { // Loop to store the elements of first	// array into resultant array // Storing the elements in
			// the resultant array
			c[i] = a[i];
		}

		for (int i = 0; i < b1; i++) {// Loop to concat the elements of second / array into resultant array / Storing the elements in the
			// resultant array
			c[a1 + i] = b[i];
		}

		
		for (int i = 0; i < c1; i++) {// Loop to print the elements of / resultant array after merging // print the element
			System.out.println(c[i]);
		}
	}
}

