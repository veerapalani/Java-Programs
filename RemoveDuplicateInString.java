
public class RemoveDuplicateInString {

	public static void main(String[] args) {
		
		

		
		String rem="veera";
		StringBuilder sb=new StringBuilder();
		rem.chars().distinct().forEach(c->sb.append((char) c));
		System.out.println(sb);
		

	}

}
