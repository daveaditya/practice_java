/*
 * Write a method reverse() that takes an integer array as its parameters and reverses
 * the of the elements in the array. Implement it two ways:
 * 
 * A. Iteratively
 * B. Recursively (Hint: Create an auxiliary function with an extra parameter)
 */
class ReverseArrItr {

	static int[] reverse(int[] a) {
		int temp;
		
		for(int i=0 ; i<a.length/2 ; i++) {
			temp = a[i];
			a[i] = a[a.length - i - 1];
			a[a.length - i - 1] = temp;
		}
		
		return a;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] a = {
				1, 2, 3, 4, 5
		};
		System.out.print("The contents of array are : ");
		for(int i : a) {
			System.out.print(i + " ");
		}
		
		System.out.println("\nReversing the array...");
		a = reverse(a);
		
		System.out.print("The contents of array are : ");
		for(int i : a) {
			System.out.print(i + " ");
		}
	}

}
