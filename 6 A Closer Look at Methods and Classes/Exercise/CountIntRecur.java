/*
 * Implement a method numTimes() that takes two parameters: an integer array called 
 * data and an integer called x. It returns the number of times that x appears in
 * the array. Implement it two ways:
 * 
 * A. Iteratively
 * B. Recursively (Hint: Create an auxiliary function with an extra parameter.)
 */
class CountIntRecur {

	static int numTimes(int[] data,int x) {
		return numTimesAux(data, x, data.length  -1);
	}
	
	static int numTimesAux(int[] data,int x,int idx) {
		if(idx == -1) {
			return 0;
		}
		else {
			if(data[idx] == x) {
				return (1 + numTimesAux(data, x, idx - 1));
			}
			else {
				return numTimesAux(data, x, idx-1);
			}
		}
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] data = {
				1, 1, 2, 5, 1, 6, 3, 1, 1, 1
		};
		System.out.println("The array contains element '1', " + numTimes(data, 1) + " times");
	}

}
