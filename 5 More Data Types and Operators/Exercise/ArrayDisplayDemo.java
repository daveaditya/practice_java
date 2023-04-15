/*
 * Write a program that creates an integer array data and then uses a for loop to
 * create a new String that displays the contents of the data array surrounded by
 * braces and separated by commas. For example, if the data array is of length 4
 * and contains the values 3,4,1,5, then the String "{3,4,1,5}" should be created
 * and printed.
 */
class ArrayDisplayDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] data = {
			3,4,1,5	
		};
		
		String display= "{";
		for(int i : data) {
			display += i + ",";
		}
		int len = display.length();
		
		String toDsply = display.substring(0, len-1);
		toDsply += "}";
		System.out.println("The string is : " + toDsply);
	}

}
