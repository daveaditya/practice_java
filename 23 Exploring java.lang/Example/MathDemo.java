// Demonstrate several Math functions.

class MathDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double theta = 12.0;
		
		System.out.println(theta + " degrees is " + Math.toRadians(theta) + " radians.");
		
		theta = 1.312;
		System.out.println(theta + " radians is " + Math.toDegrees(theta) + " degrees.\n");
		
		theta = 1.0;
		double sine = Math.sin(theta);
		double asine = Math.asin(sine);
		System.out.println("Sine of " + theta + " is " + sine);
		System.out.println("Arc sine of " + sine + " is " + asine + "\n");
		
		double h = Math.hypot(3.0,4.0);
		System.out.println("Hypotenuse is " + h + "\n");
		
		double p = Math.pow(3.0,3.0);
		System.out.println("pow(3.0,3.0) is " + p + "\n");
		
		double lg = Math.log10(100.0);
		System.out.println("log10(100.0) is " + lg + "\n");
		
		System.out.println("PI: " + Math.PI + "\nE: " + Math.E);
	}

}
