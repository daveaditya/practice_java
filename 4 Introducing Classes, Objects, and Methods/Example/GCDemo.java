// Demonstrates garbage collection and the finalize() method.
class MyClass {
	int x;
	
	MyClass(int i) {
		x=i;
	}
	
	protected void finalize() {
		System.out.println("Finalizing " + x);
	}
	
	@SuppressWarnings("unused")
	void generate(int i) {
		MyClass o=new MyClass(i);
	}
	
}

class GCDemo {

	public static void main(String[] args) {
		MyClass ob=new MyClass(0);
		
		for(int count=1;count<1000000;count++) {
			ob.generate(count);
		}

	}

}
