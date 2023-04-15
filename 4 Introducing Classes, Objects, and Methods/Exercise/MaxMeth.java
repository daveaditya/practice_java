/*
 * Create a method max() that has two integer parameters and returns the larger of x
 * and y.
 */
class MaxMeth {

	static int max(int x,int y) {
		return ((x>y) ? x : y); 
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int x = 99;
		int y = 44;
		System.out.println("Out of " + x + " and " + y + " , the largest is " + max(x, y));
	}

}
