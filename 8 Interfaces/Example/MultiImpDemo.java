// Multiple interfaces having same method signatures.
interface IfA {
	void doSomething();
}

interface IfB {
	void doSomething();
}

class MyClass implements IfA,IfB {
	
	public void doSomething() {
		System.out.println("Doing something...");
	}
	
}

class MultiImpDemo {

	public static void main(String[] args) {
		// 	TODO Auto-generated method stub
		IfA aRef;
		IfB bRef;
		
		MyClass obj = new MyClass();
		
		aRef = obj;
		aRef.doSomething();
		
		bRef = obj;
		bRef.doSomething();
	}

}
