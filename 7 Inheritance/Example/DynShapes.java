// Use dynamic method dispatch.
class TwoDShape {
	private double width;
	private double height;
	private String name;
	
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
	
	double area() {
		System.out.println("area() must be overridden");
		return(0.0);
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

class DynShapes {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TwoDShape[] shapes = new TwoDShape[5];
		
		shapes[0] = new Triangle("outlined",8.0,12.0);
		shapes[1] = new Rectangle(10);
		shapes[2] = new Rectangle(10,4);
		shapes[3] = new Triangle(7.0);
		shapes[4] = new TwoDShape(10,20,"generic");
		
		for(TwoDShape shape : shapes) {
			System.out.println("Object is : " + shape.getName());
			System.out.println("Area is " + shape.area());
			System.out.println();
		}
		
	}

}
