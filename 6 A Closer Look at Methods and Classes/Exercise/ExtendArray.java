/*
 * Implement a method addAtEnd() that takes an integer array data and an integer x as
 * its parameters. It creates a new array whose length is one greater than data's
 * length. It then copies all of data's elements into the new array and lastly adds the
 * value of x into the last element of the array. It returns the new array.
 */
class ExtendArray {

	static int[] addAtEnd(int[] input,int x) {
		int[] added = new int[input.length + 1];
		int i = 0;
		
		for(int a : input) {
			added[i] = a;
			i++;
		}
		added[i] = x;
		
		return added;		
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] array = {
				1,2,3,4,5
		};
		
		System.out.print("The original array is : ");
		for(int i : array) {
			System.out.print(i + " ");
		}
		System.out.println("\n");
		
		System.out.println("Adding '6' at end ...\n");
		
		array = addAtEnd(array, 6);
		System.out.print("The new array is : ");
		for(int i : array) {
			System.out.print(i + " ");
		}
	}

}
