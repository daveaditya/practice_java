// Use static import to bring sqrt() and pow() into view.
import static java.lang.Math.sqrt;
import static java.lang.Math.pow;

class Quadratic2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double a,b,c,x;
		
		a = 4;
		b = 1;
		c = -3;
		
		x = (-b + sqrt(pow(b,2) - 4 * a * c)) / (2 * a);
		System.out.println("First solution : " + x);
		
		x = (-b - sqrt(pow(b,2) - 4 * a * c)) / (2 * a);
		System.out.println("First solution : " + x);
	}

}
