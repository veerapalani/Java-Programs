import java.util.LinkedHashMap;
import java.util.Map;

public class countofeachcharacterstring {

	public static void main(String[] args) {
		String s="veera";
		
		String[] b=s.split(" ");
		System.out.println(b.length);
		
		Map<Character,Integer> map=new LinkedHashMap<Character,Integer>();
		for(int i=0;i<s.length();i++) 
//		for (int i = s.length() - 1; i >= 0; i--)
		{
			char c=s.charAt(i);
			if(map.containsKey(c))
			{
			Integer count=map.get(c);
			count++;
			map.put(c, count);	
		}
		
		else {
			map.put(c, 1);
			
			
		}
			System.out.println(map);	
			
	}
	}
	
//		public static void main(String[] args)
//		{
//			System.out.println("count of string");
//			countofstr();
//			}
		}




