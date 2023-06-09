// A simple class hierarchy.
// Use accessor methods to set and get private members.
class TwoDShape {
	private double width;
	private double height;
	
	public double getWidth() {
		return width;
	}

	public void setWidth(double width) {
		this.width = width;
	}

	public double getHeight() {
		return height;
	}

	public void setHeight(double height) {
		this.height = height;
	}

	void showDim() {
		System.out.println("Width and height are " + getWidth() + " and " + getHeight());
	}
}

class Triangle extends TwoDShape {
	String style;
	
	double area() {
		return(getWidth() * getHeight() / 2);
	}
	
	void showStyle() {
		System.out.println("Triangle is " + style);
	}
}

class Shapes3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Triangle t1 = new Triangle();
		Triangle t2 = new Triangle();
		
		t1.setWidth(4.0);
		t1.setHeight(4.0);
		t1.style = "filled";
		
		t2.setWidth(8.0);
		t2.setHeight(12.0);
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
