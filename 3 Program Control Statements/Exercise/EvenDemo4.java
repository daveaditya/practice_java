/*
 * Use a for loop to print the even numbers from 0 to 100.
 * Using an infinite for loop with no conditional expression and exiting the loop with
 * a break statement.
 */
class EvenDemo4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int i=0;
		System.out.println("The even numbers are : \n");
		for( ; ; ) {
			System.out.print(i + " ");
			if(i!=0 && i%5 == 0) {
				System.out.println();
			}
			if(i == 100) {
				break;
			}
			i += 2;
		}
	}

}
