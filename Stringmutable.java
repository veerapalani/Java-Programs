import java.util.Random;

public class Stringmutable {

	static String AB;
	
	public static void main(String[] args) {
			
		Random ran=new Random();
		
		//String AC= 
		
		int aa=ran.nextInt(1000 -1)+1;
		AB="abc01"+aa;
		System.out.println(AB);
		
		String a="hello"; //Stirng literal - mutable
		String b="hello";
		String s="sachin";
		String c=a.concat("world");
		System.out.println(c);
		System.out.println(a);
		s.concat(" Tendulkar");//concat() method appends the string at the end 
		 System.out.println(s);//will print Sachin because strings are immutable objects 
		s=s.concat("tendul");
		   System.out.println(s);
//		
//		String s=new String("hello");
//		String s1=new String("hello");
//		//System.out.println(s);
//		
		System.out.println(a.equals(b));
//		System.out.println(a==b);
//		System.out.println(a.equalsIgnoreCase(s));
//		System.out.println(a==s);
//		System.out.println(s==s1);
//		
//		//String Buffer and String Builder - Mutable
////		
////		StringBuffer sb=new StringBuffer("hello");
////		sb.append(" world");
////		System.out.println(sb);
////		sb.insert(2, "he");
////		System.out.println(sb);
////		sb.replace(3, 5, "g");
////		System.out.println(sb);
////		sb.reverse();
////		System.out.println(sb);
////		sb.delete(3, 6);
////		System.out.println(sb);
		
		
	}

}
