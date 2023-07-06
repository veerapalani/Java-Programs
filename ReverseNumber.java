import java.util.Arrays;
import java.util.Collections;

public class ReverseNumber {

	  
		public static void main(String[] args)   
		{  
			
		int number = 123321, reverse = 0; 

		while(number> 0)   
		{  
		int remainder = number% 10;  
		reverse = reverse * 10 + remainder;  
		number =number/10;  
		}  
		System.out.println("The reverse of the given number is: " + reverse);  
		
		
		
		if(reverse==number) {
			System.out.println("if it is a palindrome");
		}
		else
		{
			System.out.println("if it is not a palindrome");
			
		}
		
}
}



