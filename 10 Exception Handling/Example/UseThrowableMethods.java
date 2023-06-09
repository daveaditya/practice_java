// Using throwable methods.
class ExcTest {
	static void genException() {
		int[] nums = new int[4];
		
		System.out.println("Before exception is generated.");
		
		nums[7] = 10;
		
		System.out.println("this won't be displayed");
	}
}
class UseThrowableMethods {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			ExcTest.genException();
		}
		catch(ArrayIndexOutOfBoundsException exc) {
			System.out.println("Standard message is :");
			System.out.println(exc);
			System.out.println("\nStack trace : ");
			exc.printStackTrace();
		}
		System.out.println("After catch.");
	}

}
