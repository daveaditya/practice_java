// Implementing multiple interfaces.
interface IfA {
	void doSomething();
}

interface IfB {
	void doSomethingElse();
}

class MyClass implements IfA, IfB {
	
	public void doSomething() {
		System.out.println("Do something...");
	}
	
	public void doSomethingElse() {
		System.out.println("Do something else...");
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new MyClass().doSomething();
		new MyClass().doSomethingElse();
	}

}
