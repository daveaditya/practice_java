/*
 * Create a varargs  method called sum() the int values passed to it.
 * Have it return the result. Demonstrate its use.
 */
class SumVarargs {

	public static int sum(int ... v) {
		int sum = 0;
		for(int i : v) {
			sum += i;
		}
		return sum;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int total = sum(1,2,3,4,5,6,7,8,9,10);
		System.out.println("Sum of 1 to 10 is " + total);
	}

}
