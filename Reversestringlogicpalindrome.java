
public class Reversestringlogicpalindrome {

	public static void main(String[] args) {

		String s="madam";
		String t="";
		for (int i=s.length()-1;i>=0;i--)
		//for (int i = (s.length() - 1); i >=0; --i)
		{
			t= t+ s.charAt(i);
	
		}
		System.out.println(t);
		
		if (s.toLowerCase().equals(t.toLowerCase())) 
		{
		      System.out.println(s + " is a Palindrome String.");
		    }
		    else {
		      System.out.println(s + " is not a Palindrome String.");
		    }
	}//t=madam

}
