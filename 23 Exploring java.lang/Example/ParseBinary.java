// Demonstrate parseInt().

class ParseBinary {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num;
		String str = "10011101";
		
		num = Integer.parseInt(str,2);
		
		System.out.println("Here is " + str + " in decimal: " + num);
	}

}
