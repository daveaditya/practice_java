/*
 * Use a for loop to print the even numbers from 0 to 100.
 * Using a for loop whose loop control variable goes from 100 down to 0.
 */
class EvenDemo3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("The even numbers are : \n");
		for(int i=100 ; i>=0 ; i--) {
			System.out.print((100 - i) + " ");
			if(i%5 == 0) {
				System.out.println();
			}
		}
	}

}
