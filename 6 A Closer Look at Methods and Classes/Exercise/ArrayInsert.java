/*
 * Implement a method insert() that takes an integer array data, an integer x, and an 
 * integer idx as its parameters. It creates a new array whose length is one one 
 * greater than data's length. It then copies all of data's elements and x into the 
 * new array. The value of x is inserted into the new array at the index idx, and the
 * values of data are added to the new array to fill the other elements around x in 
 * the order they are in data. It returns the new array.
 */
class ArrayInsert {

	static int[] insert(int[] input, int x, int idx) {
		int[] inserted = new int[input.length + 1];
		
		int j=0;
		for(int i=0 ; i<inserted.length ; i++) {
			if(i == idx) {
				inserted[i] = x;
			}
			else {
				inserted[i] = input[j];
				j++;
			}
		}
			
		return inserted;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] array = {
				1,2,4,5
		};
		
		System.out.print("The original array is : ");
		for(int i : array) {
			System.out.print(i + " ");
		}
		System.out.println("\n");
		
		System.out.println("Adding '3' at position '2' ...\n");
		
		array = insert(array, 3, 2);
		System.out.print("The new array is : ");
		for(int i : array) {
			System.out.print(i + " ");
		}
	}

}
