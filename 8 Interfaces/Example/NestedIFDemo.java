// A nested interface example.

interface A {
	
	public interface NestedIF {
		boolean isNotNegative(int x);
	}
	
	void doSomething();
	
}

class B implements A.NestedIF {
	public boolean isNotNegative(int x) {
		return(x < 0 ? false : true);
	}
}

class NestedIFDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		A.NestedIF nif = new B();
		
		if(nif.isNotNegative(10)) {
			System.out.println("10 is not negative.");
		}
		
		if(nif.isNotNegative(-12)) {
			System.out.println("this won't be displayed.");
		}
		
	}

}
