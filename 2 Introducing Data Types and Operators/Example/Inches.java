/*
 * Compute the number if cubic inches
 * in 1 cubic mile.
 */
public class Inches {

	public static void main(String[] args) {
		long cubicInches;
		long inchesPerMile;
		
		inchesPerMile=5280*12;
		
		cubicInches=inchesPerMile*inchesPerMile*inchesPerMile;
		
		System.out.println("There are " + cubicInches + " cubic inches in a cubic mile");

	}

}
