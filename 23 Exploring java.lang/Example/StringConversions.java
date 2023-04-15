// Convert an integer into binary, decimal, and octal.

class StringConversions {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num = 19648;
		
		System.out.println(num + " in binary: " + Integer.toBinaryString(num));
		System.out.println(num + " in binary: " + Integer.toOctalString(num));
		System.out.println(num + " in binary: " + Integer.toHexString(num));
	}

}
