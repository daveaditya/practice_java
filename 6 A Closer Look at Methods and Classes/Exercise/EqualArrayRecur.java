/*
 * Write an equalArrays() method that takes two integer arrays as parameters and
 * returns true if both arrays are same length and have equal values at the
 * corresponding indices. Implement it two ways:
 * A. Iteratively.
 * B. Recursively. (Hint: Create an auxiliary function with an extra parameter.)
 */
class EqualArrayRecur {

	static boolean equalArrays(int[] a, int[] b) {
		if(a.length != b.length) {
			return false;
		}
		return equalArraysAux(a, b, a.length - 1);
	}
	
	static boolean equalArraysAux(int[] a, int[] b, int idx) {
		if(idx < 0) {
			return true;
		}
		else if(a[idx] != b[idx]) {
			return false;
		}
		else {
			return equalArraysAux(a, b, idx-1);
		}
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] a1 = {
				1, 2, 3, 4, 5
		};
		int[] b1 = {
				1, 2, 3, 4, 5
		};
		if(equalArrays(a1, b1)) {
			System.out.println("a1 and b1 are equal.");
		}
		else {
			System.out.println("a1 and b1 are not equal.");
		}
		
		int[] a2 = {
				1, 2, 3, 4, 5, 6
		};
		int[] b2 = {
				1, 2, 3, 4, 5, 7
		};
		if(equalArrays(a2, b2)) {
			System.out.println("a2 and b2 are equal.");
		}
		else {
			System.out.println("a2 and b2 are not equal.");
		}
	}

}
