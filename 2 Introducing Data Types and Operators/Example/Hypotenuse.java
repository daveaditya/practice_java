/*
 * Use the Pythagoream theorem to
 * find the length of the hypotenuse
 * given the lengths of the two opposing
 * sides.
 */
public class Hypotenuse {

	public static void main(String[] args) {
		double side1,side2,hypot;
		
		side1=3;
		side2=4;
		
		hypot=Math.sqrt(side1*side1 + side2*side2);
		
		System.out.println("Hypotenuse is " + hypot);
		
	}

}
