// equals() vs ==.
class EqualsNotEqualTo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str1 = "Alpha";
		String str2 = new String(str1);
		
		System.out.println(str1 + " equals " + str2 + " is " + str1.equals(str2));
		System.out.println(str1 + " == " + str2 + " is " + (str1 == str2));
	}

}
