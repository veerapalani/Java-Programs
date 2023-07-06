
// Java Program to demonstrate merging
// two array using pre-defined method

import java.util.Arrays;

public class MergeTwoArrays1 {
	public static void main(String[] args)
	{
		int[] a = { 1, 3,2,5,4}; // first array
		int[] b = { 7,6,9,8,10 };// second array

		int a1 = a.length;        // determines length of firstArray
		
		int b1 = b.length;         // determines length of secondArray
		
		int c1 = a1 + b1;          // resultant array size
		int[] c = new int[c1];       // create the resultant array

		System.arraycopy(a, 0, c, 0, a1); // using the pre-defined function arraycopy
		System.arraycopy(b, 0, c, a1, b1);

		System.out.println(Arrays.toString(c)); // prints the resultant array
	}
}
