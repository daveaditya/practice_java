// Find solutions to a quadratic equation.
class Quadratic {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double a,b,c,x;
		
		a = 4;
		b = 1;
		c = -3;
		
		x = (-b + Math.sqrt(Math.pow(b,2) - 4 * a * c)) / (2 * a);
		System.out.println("First solution : " + x);
		
		x = (-b - Math.sqrt(Math.pow(b,2) - 4 * a * c)) / (2 * a);
		System.out.println("First solution : " + x);
	}

}
