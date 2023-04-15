// A superclass reference can refer to a subclass object.
class TwoDShape {
	private double width;
	private double height;
	
	TwoDShape() {
		width = height = 0.0;
	}
	
	TwoDShape(double w,double h) {
		width = w;
		height = h;
	}
	
	TwoDShape(double x) {
		width = height = x;
	}
	
	TwoDShape(TwoDShape ob) {
		width = ob.width;
		height = ob.height;
	}
	
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
	
	Triangle() {
		super();
		style = "none";
	}
	
	Triangle(String s,double w,double h) {
		super(w,h);
		
		style = s;
	}
	
	Triangle(double x) {
		super(x);
		style = "filled";
	}
	
	Triangle(Triangle ob) {
		super(ob);
		style = ob.style;
	}
	
	double area() {
		return(getWidth() * getHeight() / 2);
	}
	
	void showStyle() {
		System.out.println("Triangle is " + style);
	}
}

class Shapes8 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Triangle t1 = new Triangle("outlined",8.0,12.0);
		Triangle t2 = new Triangle(t1);
		
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
