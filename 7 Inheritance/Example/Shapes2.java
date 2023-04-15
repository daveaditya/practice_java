// A simple class hierarchy.
// Private members of superclass are not accessible by a subclass.
// This example will not compile, if members are private.
class TwoDShape {
//	private double width;
//	private double height;
	
	double width;
	double height;
	
	void showDim() {
		System.out.println("Width and height are " + width + " and " + height);
	}
}

class Triangle extends TwoDShape {
	String style;
	
	double area() {
		return(width * height / 2);
	}
	
	void showStyle() {
		System.out.println("Triangle is " + style);
	}
}

class Shapes2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Triangle t1 = new Triangle();
		Triangle t2 = new Triangle();
		
		t1.width = 4.0;
		t1.height = 4.0;
		t1.style = "filled";
		
		t2.width = 8.0;
		t2.height = 12.0;
		t2.style = "outlined";
		
		System.out.println("Info for t1 : ");
		t1.showStyle();
		t1.showDim();
		System.out.println("Area is " + t1.area());
		
		System.out.println();
		
		System.out.println("Info for t2 : ");
		t2.showStyle();
		t2.showDim();
		System.out.println("Area is " + t2.area());
		
	}

}
