// Varargs, overloading, and ambiguity.
// This program contains an error and will not compile! 
public class VarArgs4 {
	static void vaTest(int ... v) {
		
	}
	
	static void vaTest(boolean  ... v) {
		
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		vaTest(1,2,3);
		vaTest(true,false,false);
//		vaTest();	// Ambiguous
	}

}
