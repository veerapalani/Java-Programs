import java.util.HashMap;

public class countofstring2 {

	
		public static void main(String[] args) {
		      String str = "Veera";
		      HashMap <Character, Integer> hMap = new HashMap<>();
//		      for (int i = str.length() - 1; i >= 0; i--) {
		      for(int i=0;i<str.length();i++) 
		      {
		    	  char c=str.charAt(i);
		      if (hMap.containsKey(c)) {
		            int count = hMap.get(c);
		            hMap.put(c, ++count);
		         } else {
		            hMap.put(c,1);
		         }
		      }
		      System.out.println(hMap);
		   }
		}

	


