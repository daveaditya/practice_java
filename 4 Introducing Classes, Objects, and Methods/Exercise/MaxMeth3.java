/*
 * Create a method max() that has three integer parameters and returns the larger of x
 * , y, and z. Using nested if.
 */
class MaxMeth3 {

	static int max(int x,int y, int z) {
		if(x>y) {
			if(x>z) {
				return x;
			}
			return z;
		}
		else {
			if(y>z) {
				return y;
			}
			return z;
		}
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int x = 99;
		int y = 44;
		int z = 50;
		System.out.println("Out of " + x + " , " + y + " , and " + z + " , the largest is " + max(x, y, z));
	}

}
