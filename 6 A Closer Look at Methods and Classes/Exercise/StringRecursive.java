/*
 * Write a recursive method that displays the contents of a string backwards.
 */

class StringRecursive {
	
	public static void printRec(String str,int i) {
		if(i < 0) {
			return;
		}
		else {
			System.out.print(str.charAt(i));
			printRec(str, --i);
		}
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String input = "TestString";
		printRec(input, input.length() - 1);		
	}

}
