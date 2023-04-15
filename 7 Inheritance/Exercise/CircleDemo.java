// CReate an abstract class.
class TwoDShape {
	double width;
	double height;
	String name;
	
	TwoDShape() {
		width = height = 0.0;
		name = "none";
	}
	
	TwoDShape(double w,double h,String n) {
		width = w;
		height = h;
		name = n;
	}
	
	TwoDShape(double x,String n) {
		width = height = x;
		name = n;
	}
	
	TwoDShape(TwoDShape ob) {
		width = ob.width;
		height = ob.height;
		name = ob.name;
	}
		
	double getWidth() {
		return width;
	}
	
	void setWidth(double width) {
		this.width = width;
	}
	
	double getHeight() {
		return height;
	}
	
	void setHeight(double height) {
		this.height = height;
	}
	
	String getName() {
		return name;
	}
	
	void setName(String name) {
		this.name = name;
	}
	
	void showDim() {
		System.out.println("Width and height are " + width + " and " + height);
	}
		
}

class Triangle extends TwoDShape {
	private String style;
	
	Triangle() {
		super();
		style = "none";
	}
	
	Triangle(String s,double w,double h) {
		super(w,h,"triangle");
		
		style = s;
	}
	
	Triangle(double x) {
		super(x,"triangle");
		
		style = "filled";
	}
	
	Triangle(Triangle ob) {
		super(ob);
		style = ob.style;		
	}
	
	public String getStyle() {
		return style;
	}

	public void setStyle(String style) {
		this.style = style;
	}
	
	double area() {
		return(getWidth());
	}
	
	void showStyle() {
		System.out.println("Triangle is " + style);
	}
}

class Rectangle extends TwoDShape {
	Rectangle() {
		super();
	}
	
	Rectangle(double w,double h) {
		super(w,h,"rectangle");
	}
	
	Rectangle(double x) {
		super(x,"rectangle");
	}
	
	Rectangle(Rectangle ob) {
		super(ob);
	}
	
	boolean isSquare() {
		if(getWidth() == getHeight()) {
			return(true);
		}
		return(false);
	}
	
	double area() {
		return(getWidth()*getHeight());
	}
}

class Circle extends TwoDShape {
	
	final double PI = 3.14;
	
	Circle() {
		super();
	}
	
	Circle(double radius) {
		super(radius,radius,"Circle");
	}
	
	double area() {
		return (PI*width*width);
	}
	
}

class CircleDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
				
		Triangle t1 = new Triangle("outlined",8.0,12.0);
		Rectangle r1 = new Rectangle(10);
		Circle c1 = new Circle(5.5);
				
		System.out.println("Object is : " + t1.getName());
		System.out.println("Area is " + t1.area());
		System.out.println();
		
		System.out.println("Object is : " + r1.getName());
		System.out.println("Area is " + r1.area());
		System.out.println();
		
		System.out.println("Object is : " + c1.getName());
		System.out.println("Area is " + c1.area());
		System.out.println();
		
		
	}

}
