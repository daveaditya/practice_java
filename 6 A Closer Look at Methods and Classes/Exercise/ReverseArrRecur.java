/*
 * Write a method reverse() that takes an integer array as its parameters and reverses
 * the of the elements in the array. Implement it two ways:
 * 
 * A. Iteratively
 * B. Recursively (Hint: Create an auxiliary function with an extra parameter)
 */
class ReverseArrRecur {

	static int[] reverse(int[] a) {
		reverse(a,a.length - 1);
		return a;
	}
	
	static int[] reverse(int[] a, int idx) {
		int temp;
		
		if(idx == a.length/2) {
			return a;
		}
		else {
			temp = a[idx];
			a[idx] = a[a.length - idx  -1];
			a[a.length - idx - 1] = temp;
			return reverse(a,idx - 1);
		}
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
