/*
 * Write a program that creates a "triangular" two-dimensional array A of 10 rows.
 * The first row has length 1, the second row has length 2, the third row has length 3,
 * and so on. Then initialize the array using nested for loops so that the values of
 * A[i][j] is i+j. Finally, print out the array in a nice triangular form. 
 */
class TriangularArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[][] triangular = new int[10][];
		
		for(int i=0 ; i<10 ; i++) {
			triangular[i] = new int[i+1];
		}
		
		for(int i=0 ; i<10 ; i++) {
			for(int j=0 ; j<i+1 ; j++) {
				triangular[i][j] = i+j;
			}
		}
		
		System.out.println("The triangular array is : \n");
		
		for(int i=0 ; i<10 ; i++) {
			for(int j=0 ; j<i+1 ; j++) {
				System.out.print(triangular[i][j] + "  ");
			}
			System.out.println();
		}
		
	}

}
