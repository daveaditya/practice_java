// This will not compile.
class X {
	int a;
	
	X(int i) {
		a = i;
	}
}

class Y {
	int a;
	
	Y(int i) {
		a = i;
	}
}

class IncompatibleRef {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		X x =new X(10);
		X x2;
		Y y = new Y(5);
		
		x2 = x;
		
//		x2 = y; 	// type mismatch.
	}

}
