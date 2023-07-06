public class reversestring {

 public static void main(String[] args) {

  String str = "Welcome";
  String revString = "";
  StringBuilder SB=new StringBuilder(str);
  SB.reverse();
  
System.out.println(SB);
  for (int i = str.length() - 1; i >= 0; i--) {
   revString =revString+ str.charAt(i);
  }

  System.out.println(revString);

}
}