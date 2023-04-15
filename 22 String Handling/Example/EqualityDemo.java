// Demonstrate equals() and equalsIgnoreCase().

class EqualityDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str1 = "table";
		String str2 = "table";
		String str3 = "chair";
		String str4 = "TABLE";
		
		if(str1.equals(str2)) {
			System.out.println(str1 + " equals " + str2);
		}
		else {
			System.out.println(str1 + " does not equal " + str2);
		}
		
		if(str1.equals(str3)) {
			System.out.println(str1 + " equals " + str3);
		}
		else {
			System.out.println(str1 + " does not equal " + str3);
		}
		
		if(str1.equals(str4)) {
			System.out.println(str1 + " equals " + str4);
		}
		else {
			System.out.println(str1 + " does not equal " + str4);
		}
		
		if(str1.equalsIgnoreCase(str4)) {
			System.out.println("Ignoring case differences, " + str1 + " equals " + str4);
		}
		else {
			System.out.println(str1 + " does not equal " + str4);
		}
	}

}
