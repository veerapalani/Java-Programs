import java.util.HashMap;
import java.util.Map;

public class CountOccurrences {

	public static void main(String[] args) {
		
		  
		        String s = "abcdesabcd";
//		        char ch = 'o';
//		        int cnt = 0;
//		         
//		        for ( int i = 0; i < str.length(); i++) {
//		            if (str.charAt(i) == ch)
//		                cnt++;
//		        }
//		        System.out.println("Occurrences of "+ch+" are " +cnt);
		        Map<Character,Integer> map = new HashMap<Character,Integer>();
		        for (int i = 0; i < s.length(); i++) {
		          char c = s.charAt(i);
		          if (map.containsKey(c)) {
		            int cnt = map.get(c);
		            map.put(c, ++cnt);
		          } else {
		            map.put(c, 1);
		          }
		          System.out.println(map);
		        }
		    }
		}


