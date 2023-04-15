/*
 * Demonstrate automatic conversion from long to double.
 */
public class LtoD {

	public static void main(String[] args) {
		long longVar;
		double doubleVar;
		
		longVar=100123285L;
		doubleVar=longVar;
		
		System.out.println("longVar and doubleVar : " + longVar + " " + doubleVar);

	}

}
