package abstraction;

public interface Outer {

	void omethod();
	
	Inner method();

	interface Inner {
		void imethod();
	}

}
