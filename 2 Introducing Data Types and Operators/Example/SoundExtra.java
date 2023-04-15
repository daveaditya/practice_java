/*
 * Compute the distance to a large object,
 * such as the rock wall,
 * by timing the echo.
 */
public class SoundExtra {

	public static void main(String[] args) {
		double time=7.2;
		double distance = (time/2.0) * 1100;
		
		System.out.println("The rock wall is " + distance + " feet away");
		
	}

}
