
public class Classone {
static int a=100;

public void master ()
{
	
	System.out.println("method calling");
}
	public static void main(String[] args) {
		
		Classone mas=new Classone();
		Testtwo tw=new Testtwo();
		tw.m1();
		mas.master();
		System.out.println("First program");
		
		System.out.println(a);
	}

}
