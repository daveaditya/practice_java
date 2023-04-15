/*
 * Implement a method numTimes() that takes two parameters: an integer array called 
 * data and an integer called x. It returns the number of times that x appears in
 * the array. Implement it two ways:
 * 
 * A. Iteratively
 * B. Recursively (Hint: Create an auxiliary function with an extra parameter.)
 */
class CountIntItr {

	static int numTimes(int[] data,int x) {
		int count = 0;
		for(int i : data) {
			if(i == x) {
				count++;
			}
		}
		
		return count;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] data = {
				1, 1, 2, 5, 1, 6, 3, 1, 1, 1
		};
		System.out.println("The array contains element '1', " + numTimes(data, 1) + " times");
	}

}
