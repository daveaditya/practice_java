// Demonstrate compareRo() and compareToIgnoreCase().

class CompareStrings {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str1 = "alpha";
		String str2 = "ALPHA";
		String str3 = "Beta";
		int result;
		
		result = str1.compareTo(str2);
		if(result != 0) {
			System.out.println("Using compareTo(): " + str1 + " and " + str2 + " differ");
		}
		
		result = str1.compareToIgnoreCase(str2);
		if(result == 0) {
			System.out.println("Using compareToIgnoreCase(): " + str1 + " and " + str2 + " are the same\n");
		}

		System.out.println("Using compareTo() to compare " + str1 + " with " + str3);
		
		
		result = str1.compareTo(str3);
		if(result < 0) {
			System.out.println(str1 + " is less than " + str3);
		}
		else if(result == 0) {
			System.out.println(str1 + " is equal to " + str3);
		}
		else if(result > 0) {
			System.out.println(str1 + " is greater than " + str3);
		}
		
		
		System.out.println();

		System.out.println("Using compareToIgnoreCase() to compare " + str1 + " with " + str3);
		result = str1.compareToIgnoreCase(str3);
		if(result < 0) {
			System.out.println(str1 + " is less than " + str3);
		}
		else if(result == 0) {
			System.out.println(str1 + " is equal to " + str3);
		}
		else if(result > 0) {
			System.out.println(str1 + " is greater than " + str3);
		}
	}

}
