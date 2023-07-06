
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.util.Calendar;
import java.util.Date;

public class Dateclassdemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//current date..current time./
		Date d= new Date();

		SimpleDateFormat sdf=new SimpleDateFormat("M/d/yyyy");
		SimpleDateFormat sd=new SimpleDateFormat("M/d/yyyy hh:mm:ss");
		System.out.println(sdf.format(d));
		System.out.println(sd.format(d));
		System.out.println(d.toString());
		String str=sdf.format(d);
		System.out.println("current date:"+str);
		 LocalDate date = LocalDate.now();
	      System.out.println("Current Date: "+date);
	      DateFormat formatter = new SimpleDateFormat("dd/MM/yy");
	      Calendar obj = Calendar.getInstance();
	      String str1 = formatter.format(obj.getTime());
	      System.out.println("Current Date: "+str1 );

	}

}
