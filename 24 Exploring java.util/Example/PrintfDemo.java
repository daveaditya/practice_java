// Demonstrate printf().

class PrintfDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Here are some numeric values " + "in different formats.\n");
		
		System.out.printf("Various integer formats: ");
		System.out.printf("%d %(d %+d %05d\n",3,-3,3,3);
		
		System.out.println();
		System.out.printf("Default floating-point format: %f\n",1234567.123);
		
		System.out.printf("Floating-point with commas: %,f\n",1234657.123);
		System.out.printf("Negative floating-point default: %f\n",1234657.123);
		System.out.printf("Negative floating-point default: %,(f\n",1234567.123);
		
		System.out.println();
		
		System.out.printf("Line up positive and negaive values:\n");
		System.out.printf("% ,.2f\n% ,.2f\n",1234567.123,-1324567.123);
	}

}
