/*
 * What would happen if the drawStart() method described in the section on recursion
 * were invoked using as its argument the integer -1? Modify the method so that if a
 * negative integer is passed in as its argument nothing is printed. 
 */
class StarDrawer {
	void drawStars(int n) {
		if(n < 0) {
			return;
		}
		if(n==1) {
			System.out.print("*");
		}
		else {
			System.out.print("*");
			drawStars(n-1);
		}
	}
}

class StarAvoidNegative {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		StarDrawer drawer = new StarDrawer();
		
		drawer.drawStars(1);
		System.out.println();
		drawer.drawStars(2);
		System.out.println();
		drawer.drawStars(3);
		System.out.println();
		drawer.drawStars(10);
		System.out.println();
		drawer.drawStars(-1);
		System.out.println();
	}

}
