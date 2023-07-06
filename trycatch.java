
public class trycatch {

	public static void main(String[] args) {
		try{
		      int data=100/0;
		}
		catch(ArithmeticException e)
		{
		System.out.println("DEF");
		}
		
		catch(Exception e){
			System.out.println("ABC");
			}
		

		finally {
		System.out.println("GHI");
		}

	}

}
