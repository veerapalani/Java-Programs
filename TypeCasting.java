
public class TypeCasting {

	public static void main(String[] args) {
		
		//Example: Converting int to double
		 // create int type variable
	    int num = 10;
	    System.out.println("The integer value: " + num);

	    // convert into double type
	    double data = num;
	    System.out.println("The double value: " + data);
	    
	  //  Example: Converting double into an int
	    
	 // create double type variable
	    double num1 = 10.99;
	    System.out.println("The double value: " + num1);

	    // convert into int type
	    int data1 = (int)num1;  
//Here, the int keyword inside the parenthesis indicates that that the num variable is converted into the int type.	    
	    System.out.println("The integer value: " + data1);
	    
	 //   Example 1: Type conversion from int to String
	    
	    // create int type variable
	    int num2 = 10;
	    System.out.println("The integer value is: " + num2);

	    // converts int to string type
	    String data2 = String.valueOf(num2);
	    System.out.println("The string value is: " + data2);
	    
	   // Example 2: Type conversion from String to int
	    
	 // create string type variable
	    String data3 = "10";
	    System.out.println("The string value is: " + data3);

	    // convert string variable to int
	    int num3 = Integer.parseInt(data3);
	    System.out.println("The integer value is: " + num3);

	}

}
