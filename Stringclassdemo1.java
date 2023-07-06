
public class Stringclassdemo1 {

	public static void main(String[] args) {
		
		// string : it is one of the pre-built class in java 
		/* 1. string literal
		 * 2. By creating object of string 
		 */
		
		String a=" javatraining"; //string literal
//		String b="hello";
//		//string a=new string("hello"); //with string class
//		String b=new String("hello");
		System.out.println(a.charAt(3));
		System.out.println(a.indexOf("v"));
		System.out.println(a.substring(4, 9));
		System.out.println(a.substring(5));
		System.out.println(a.concat("course"));
		//a.length()
		System.out.println(a.trim());
		a.toUpperCase();
		a.toLowerCase();
		//split
		String arr[]=a.split("t");
		System.out.println(arr[0]);
		System.out.println(arr[1]);
		System.out.println(a.replaceAll("a", "e"));
		
		
		
		
		
	}

}
