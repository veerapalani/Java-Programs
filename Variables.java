
public class Variables {
	
	String name ; // Instance Variables
	String address;
	static String city="chennai" ; //Class Variables
	static int i=0;
	
	Variables(String name, String address)
	{
		this.name=name;
		this.address=address;
		i++;
		System.out.println(i);
	}

	public void getaddress()
	{
		System.out.println(address+" "+city);
	}
	public static void getcity()
	{
		System.out.println(city);
	}
	public static void main(String[] args) {
		
	Variables obj=new Variables("bom","itcity");
	Variables obj1=new Variables("trd","itcity");
	Variables obj2=new Variables("car","itcity");
	obj.getaddress();
	obj1.getaddress();
	obj2.getaddress();
	Variables.getcity();
	Variables.i=5;
	obj.address="ddd";
	
		
	}

}
