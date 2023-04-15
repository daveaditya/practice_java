/*
 * Create a Swapper class with two integer instance variables x and y and a constructor
 * with two parameters that initialize the two variables. Also include three methods: a
 * getX() method that returns x, a getY() method that return y, and a void swap() 
 * method that swaps the values of x and y. Then create a SwapperDemo class that tests
 * all the methods.
 */
class Swapper {
	int x, y;
	
	Swapper() {
		x = y = 0;
	}
	
	Swapper(int x, int y) {
		this.x = x;
		this.y = y;
	}
	
	int getX() {
		return x;
	}
	
	int getY() {
		return y;
	}
	
	void swap() {
		int temp = y;
		y = x;
		x = temp;
	}
}


class SwapperDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Swapper obj = new Swapper(10,20);
		System.out.println("Before SWAP: x = " + obj.getX() + " and y = " + obj.getY());
		obj.swap();
		System.out.println("After SWAP: x = " + obj.getX() + " and y = " + obj.getY());
	}

}
