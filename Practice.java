
public class Practice {
	 public static void main(String argu[]) {
	String s="abacda";
	char[] array = s.toCharArray();
	int count=1;
	for(int i =1; i < s.length(); i++) {
	    if(array[i] == array[i-1]) {
	        count++;
	        
	               System.out.print(array[i] + " ");
	               break;
	    }
}
}
}
