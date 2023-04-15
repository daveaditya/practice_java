/*
 * The StarPattern program below prints out the pattern of stars underneath it.
 * Modify the program so that it prints out the other patterns below using nested loops.
 */
class StarPatternDefault {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		for(int i=1 ; i<=5 ; i++) {
			for(int j=1 ; j<=i ; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}

}
