import java.text.DecimalFormat;

public class Float {

	public static void main(String[] args) {
		    
		{  
			float number = 1.2345667f; 
			number= (short)(100*number);
			number=(float)(number/100);
			System.out.println(number);
			DecimalFormat df = new DecimalFormat("0.00");
			float f = -8.0222222f;
		
			f = Float.parseFloat(df.format(f));
			System.out.println(f);
		}  
		}

	private static float parseFloat(String format) {
		// TODO Auto-generated method stub
		return 0;
	}  

	}

 
