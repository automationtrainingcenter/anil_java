package polymorphism;

public class RunTimePolyChild extends RunTimePolyParent {
	// annotations
	@Override
	public void add(int a, String b) {
		if(b.matches("\\d+")) {
			int ib = Integer.parseInt(b);
			System.out.println(a+ib);
		}else {
//			super.add(a, b);
			System.out.println(a+b);
		}
		
	}

}
