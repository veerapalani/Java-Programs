public class revers_strin_StringBuffer{
public static void main(String args[]){  
	
//	No.	StringBuffer	StringBuilder
//	1)	StringBuffer is synchronized i.e. thread safe. It means two threads can't call the methods of StringBuffer simultaneously.	
//	StringBuilder is non-synchronized i.e. not thread safe. It means two threads can call the methods of StringBuilder simultaneously.
//	2)	StringBuffer is less efficient than StringBuilder.	
//	StringBuilder is more efficient than StringBuffer.
//	3)	StringBuffer was introduced in Java 1.0	
//	StringBuilder was introduced in Java 1.5
	
	
StringBuffer sb=new StringBuffer("Hello");  
sb.reverse();  
sb.chars().distinct().forEach(c->sb.append((char)c));
System.out.println(sb);//prints olleH  

sb.delete(1,3);  
System.out.println(sb);//prints Hlo  
sb.replace(1,3,"Java");  
System.out.println(sb);//prints HJavalo  
System.out.println(sb.capacity()); // default 16
sb.append("Hello");
System.out.println(sb.capacity()); // now 16
sb.append("java is my favourite language");
System.out.println(sb.capacity());
// Now (16*2)+2=34     i.e (oldcapacity*2)+2

//String Builder

StringBuilder sb1=new StringBuilder("Hello ");  
sb.insert(1,"Java");//now original string is changed  
System.out.println(sb1);//prints HJavaello 
sb1.delete(1,3);  
System.out.println(sb1);//prints Hlo  

sb1.replace(1,3,"Java");  
System.out.println(sb1);//prints HJavalo  
}  
} 