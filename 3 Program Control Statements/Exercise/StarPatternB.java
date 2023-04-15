/*
 * The StarPattern program below prints out the pattern of stars underneath it.
 * Modify the program so that it prints out the other patterns below using nested loops.
 * 
 *      *
 *     **
 *    ***
 *   ****
 *  *****    
 */
class StarPatternB {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		for(int i=5 ; i>=1 ; i--) {
			for(int j=1 ; j<i ; j++) {
				System.out.print(" ");
			}
			for(int k=0 ; k<=(5 - i) ; k++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}

}
