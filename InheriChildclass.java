
public class InheriChildclass extends InheritanceParentclass {
	String name ="QAClickAcademy";


	public InheriChildclass()
	{
	super();// this should be always be at first line
	System.out.println("child class construtor");

	}
	public void getStringdata()
	{
	System.out.println(name);
	System.out.println(super.name);
	}
	public void getData()
	{
	super.getData();
	System.out.println("I am in child class");
	}
	public static void main(String[] args) {
		InheriChildclass cd = new InheriChildclass();

		cd.getStringdata();
		cd.getData();
		}

	}


