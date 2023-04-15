// Demonstrate variable-length arguments.
public class VarArgs {
	
	static void vaTest(int ... v) {
		System.out.println("Number of arguments : " + v.length);
		System.out.println("Contents : ");
		
		for(int i=0;i<v.length;i++) {
			System.out.println(" arg " + i + " : " + v[i]);
		}
		
		System.out.println();
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		vaTest(10);
		vaTest(1,2,3);
		vaTest();
	}

}
