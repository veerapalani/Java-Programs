import java.util.LinkedHashMap;
import java.util.Map;

public class Stringcounteachword {

	public static void countofstring() {
		//String : it is one of the prebuilt class in java
		/* 1.String literal
		2.by creating object of string*/
//		String a="veera";
//		
//		System.out.println(a.charAt(3));
//		System.out.println(a.indexOf("a"));
		
		String s="veera";
		String[] split=s.split("");
		Map<String,Integer> map=new LinkedHashMap<String,Integer>();
		for (String X:split) {
			if(map.containsKey(X)) {
				
			
			Integer count=map.get(X);
			count++;
			map.put(X, count++);
		}
		else {
			map.put(X, 1);
			
		}
			System.out.println(map);
	}
	}
		public static void main(String[] args) {
			System.out.println("	string enter");
			countofstring();
			
		}

	}
