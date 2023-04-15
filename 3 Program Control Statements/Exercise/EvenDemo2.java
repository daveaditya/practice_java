/*
 * Use a for loop to print the even numbers from 0 to 100.
 * Using a for loop whose loop control variable goes from 0 to 50.
 */
class EvenDemo2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("The even numbers are : \n");
		for(int i=0 ; i<=50 ; i++) {
			System.out.print((2*i) + " ");
			if(i%5 == 0) {
				System.out.println();
			}
		}
	}

}
