// This won't work.
class ExcTypeMismatch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] nums = new int[4];
		
		try {
			System.out.println("Before exeption is generated.");
			nums[7] = 10;
			System.out.println("this won't be display");
		}
		// Can't catch an array boundary error with an ArithmeticException.
		catch(ArithmeticException exc) {
			System.out.println("Index out-of-bounds!");
		}
		
		System.out.println("After catch.");
	}

}
