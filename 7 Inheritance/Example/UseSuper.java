// Using super to overcome name hiding.
class A {
	int i;
}

class B extends A {
	int i;
	
	B(int a,int b) {
		super.i = a;
		i = b;
	}
	
	void show() {
		System.out.println("i in super class : " + super.i);
		System.out.println("i in subclass : " + i);
	}
}

public class UseSuper {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		B subOb = new B(1,2);
		subOb.show();
	}

}
