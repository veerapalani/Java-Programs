
public class Vowles {

	

	public static void main(String args[]) {

//	      String str = new String("Hi Welcome to Tutorialspoint");
//	      for(int i=0; i<str.length(); i++) {
//	         if(str.charAt(i) == 'a'|| str.charAt(i) == 'e'|| str.charAt(i) == 'i' || str.charAt(i) == 'o' || str.charAt(i) == 'u') {
//	            System.out.println("Given string contains "+str.charAt(i)+" at the index "+i);
//	            
//	         }
//	      }
		
		
		  String s = "Hello how are you WhAt is this";
	        for (int i = 0; i < s.length(); i++) {
	            if (s.charAt(i) == 'a' || s.charAt(i) == 'e' || s.charAt(i) == 'i' || s.charAt(i) == 'o' || s.charAt(i) == 'u'
	                    || s.charAt(i) == 'A' || s.charAt(i) == 'E' || s.charAt(i) == 'I' || s.charAt(i) == 'O' || s.charAt(i) == 'U') {
	                System.out.println("Found vowel " + s.charAt(i) + " at position " + i);
	            }
	        }
	    }
	   }
	