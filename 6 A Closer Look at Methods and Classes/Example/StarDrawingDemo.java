// Program to demonstrate recursion.
class StarDrawer {
	void drawStars(int n) {
		if(n==1) {
			System.out.print("*");
		}
		else {
			System.out.print("*");
			drawStars(n-1);
		}
	}
}

class StarDrawingDemo {

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
		
	}

}
