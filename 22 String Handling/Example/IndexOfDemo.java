// Demonstrate indexOf() and lastIndexOf().

class IndexOfDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str = "alpha beta gamma theta zeta";
		
		System.out.println("The string is: " + str);
		System.out.println("The first index of t is " + str.indexOf('t'));
		
		System.out.println("The last index of t is " + str.lastIndexOf('t'));
		
		System.out.println("Thre first index of eta is " + str.indexOf("eta"));
		
		System.out.println("The last index of eta is " + str.lastIndexOf("eta"));
		
		System.out.println("The first index of eta after position 10 is " + str.indexOf("eta",10));
	}

}
