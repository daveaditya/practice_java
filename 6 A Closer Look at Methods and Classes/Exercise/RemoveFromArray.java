/*
 * Implement a method remove() that takes an integer array data and an integer idx as
 * its parameters. It creates a new array whose length is one less than data's length.
 * It then copies all of data's elements into the new array except for the value
 * at the index idx. It returns the new array.
 */
class RemoveFromArray {

	static int[] remove(int[] input, int idx) {
		int[] removed = new int[input.length - 1];
		
		int j=0;
		for(int i=0 ; i<input.length ; i++) {
			if(i == idx) {
				continue;
			}
			removed[j] = input[i];
			j++;
		}
		
		return removed;
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
		
		System.out.println("Removing element at position '2' i.e. 3 ...\n");
		
		array = remove(array, 2);
		System.out.print("The new array is : ");
		for(int i : array) {
			System.out.print(i + " ");
		}
	}

}
