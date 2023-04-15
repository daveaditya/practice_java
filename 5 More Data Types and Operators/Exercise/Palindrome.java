/*
 * Write a program that creates a String and then uses a for loop to test whether the
 * String is a palindrome, which means that if you reverse the order of the characters
 * in the String, you get the same String back. For example, "abcdcba" is a palindrome.
 */
class Palindrome {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String input = "abcdcba";
		String reverse = "";
		
		for(int i=input.length() - 1 ; i>=0 ; i--) {
			reverse += input.charAt(i);
		}
		
		boolean palindrome = true;
		for(int i = 0 ; i<input.length() ; i++) {
			if(reverse.charAt(i) != input.charAt(i)) {
				palindrome = false;
			}
		}
		
		System.out.println("abcdba is " + (palindrome ? "Palindrome" : "Not a Palindrome"));
	}

}
