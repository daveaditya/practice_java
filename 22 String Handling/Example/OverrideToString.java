// Override toString() for Box Class.

class Box {
	double width;
	double height;
	double depth;
	
	Box(double w,double h,double d) {
		width = w;
		height = h;
		depth = d;
	}
	
	public String toString() {
		return "Dimensions are " + width + " by " + depth + " by " + height + ".";
	}
}

class OverrideToString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Box b = new Box(10,12,14);
		String str = "Box b: " + b;
		System.out.println(b);
		System.out.println(str);
	}

}
