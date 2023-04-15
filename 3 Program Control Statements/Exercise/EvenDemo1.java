/*
 * Use a for loop to print the even numbers from 0 to 100.
 * Using a for loop that increments the loop control variable by 2 each iteration.
 */
class EvenDemo1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("The even numbers are : \n");
		for(int i=0 ; i<=100 ; i+=2) {
			System.out.print(i + " ");
			if(i%5 == 0) {
				System.out.println();
			}
		}
	}

}
