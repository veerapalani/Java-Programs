
public class InterfacedemoAustralianTrafic implements InterfacedemoCentralTraffic , InterfaceContinentalTraffic{

	public static void main(String[] args) {
		InterfacedemoCentralTraffic a= new InterfacedemoAustralianTrafic();
		a.redStop();
		a.FlashYellow();
		a.greenGo();

		InterfacedemoAustralianTrafic at=new InterfacedemoAustralianTrafic();
		InterfaceContinentalTraffic ct=new InterfacedemoAustralianTrafic();
		at.walkonsymbol();
		ct.Trainsymbol();

	}

	@Override
	public void greenGo() {
		System.out.println(" Green go implementation");
		
	}
	
	public void walkonsymbol()
	{
	System.out.println("walking");
	}

	@Override
	public void redStop() {
		System.out.println(" redstop implementation");
		
	}

	@Override
	public void FlashYellow() {
		System.out.println(" flash yellow implementation");
		
	}

	@Override
	public void Trainsymbol() {
		System.out.println(" Trainsymbol");
		
	}

}
