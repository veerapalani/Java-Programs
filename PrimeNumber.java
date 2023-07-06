
public class PrimeNumber {
public static void main (String[] args) {
	int c=0;
	int count=0;
	System.out.println("prime number");
	for(int n=1;n<=200;n++) {
		for(int i=2;i<n/2;i++) {
			if(n%i==0) {
				count=1;
		
			}
		}
			if(count==0) {
				//If count 0 number is prime number	
				System.out.println(n+", ");
				c++;
				
			}
		
	}
		System.out.println("\n count of prime number =" +c);
	
}
}
