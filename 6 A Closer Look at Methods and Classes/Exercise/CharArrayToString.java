/*
 * Implement a charArray2String() method that takes a char array as its parameter.
 * It creates and returns a String that contains the same characters in the same
 * order as in the array.
 */
class CharArrayToString {

	static String charArray2String(char[] input) {
		String str = "";
		
		for(char ch : input) {
			str += ch;
		}
		
		return str;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		char[] array = {
				'h', 'e', 'l', 'l', 'o', ' ', 'w', 'o', 'r', 'l', 'd'
		};
		String str = charArray2String(array);
		System.out.println("Str says : " + str);
	}

}
