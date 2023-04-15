// Manually throw an exception.
class ThrowDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			System.out.println("Before throw.");
			throw(new ArithmeticException());
		}
		catch(ArithmeticException exc) {
			System.out.println("Exception caught.");
		}
		System.out.println("After try/catch block.");
	}

}
