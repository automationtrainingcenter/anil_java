package abstraction;

public class OuterInnerImpl implements Outer, Outer.Inner {

	@Override
	public void omethod() {
		System.out.println("outer interface method implmentation");
	}

	@Override
	public void imethod() {
		System.out.println("inner interface method immplementation");
	}

	@Override
	public Inner method() {
		return this;
	}

}
