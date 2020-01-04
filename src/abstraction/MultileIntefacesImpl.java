package abstraction;

public class MultileIntefacesImpl implements InterfaceOne, InterfaceTwo{

	@Override
	public void methodOne() {
		System.out.println("inteface one method one implementation");
	}

	@Override
	public void methodTwo() {
		System.out.println("interface two method two implementation");
	}

}
