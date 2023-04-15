// SimpleStack Interface.
class SimpleStackExcDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		FixedLengthStack stack = new FixedLengthStack(5);
		char ch;
		int i;
		
		try {
			for(i=0;i<6;i++) {
				System.out.print("Attempting to push : " + (char)('A' + i));
				stack.push((char)('A' + i));
				System.out.println(" - OK");
			}
			System.out.println();
		}
		catch(StackFullException exc) {
			System.out.println(exc);
		}
		
		System.out.println();
		
		try {
			for(i=0;i<6;i++) {
				System.out.print("Popping next char : ");
				ch  =stack.pop();
				System.out.println(ch);
			}
		}
		catch(StackEmptyException exc) {
			System.out.println(exc);
		}
	}

}
