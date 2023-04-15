/*
 * Implement a string2CharArray() method that takes a String as its parameter. It
 * creates and returns a char array containing the same characters in the same order
 * as in the string.
 */
class StringToCharArray {

	static char[] string2CharArray(String input) {
		char[] array = new char[input.length()];
		
		for(int i=0 ; i<input.length() ; i++) {
			array[i] = input.charAt(i);
		}
		
		return array;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		char[] arr = string2CharArray("Hello World");
		for(char ch : arr) {
			System.out.print(ch);
		}
	}

}
