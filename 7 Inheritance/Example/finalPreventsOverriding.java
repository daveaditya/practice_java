// Use of final keyword against a method prevents overriding.
class A {
	final void meth() {
		System.out.println("This is a final method.");
	}
}

class B extends A {
//	void meth() {
//		System.out.println("Illegal!");
//	}
}
class finalPreventsOverriding {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
