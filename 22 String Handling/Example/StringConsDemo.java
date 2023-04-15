// Demonstrate several String constructors.

class StringConsDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			char[] digits = new char[16];
			
			for(int i=0 ; i<16 ; i++) {
				if(i < 10) {
					digits[i] = (char)('0'+i);
				}
				else {
					digits[i] = (char)('A' + i - 10);
				}
			}
			
			String digitsStr = new String(digits);
			System.out.println(digitsStr);
			
			String nineToTwelve = new String(digits,9,4);
			System.out.println(nineToTwelve);
			
			String digitsStr2 = new String(digitsStr);
			System.out.println(digitsStr2);
			
			String empty = new String();
			System.out.println("Empty string: " + empty);
	}

}
