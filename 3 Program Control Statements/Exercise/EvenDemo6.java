/*
 * Use a loop to print the even numbers from 0 to 100.
 * Using a do-while loop.
 */
class EvenDemo6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int i=0;
		System.out.println("The even numbers are : \n");
		do {
			System.out.print(i + " ");
			if(i!=0 && i%5 == 0) {
				System.out.println();
			}
			if(i == 100) {
				break;
			}
			i += 2;
		} while(true);
	}

}
