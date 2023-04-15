// Demonstrate a simple generic stack stack class.

class GenSimpleStackDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int i;
		Integer[] nums = new Integer[5];
		String[] strs = new String[3];
		
		GenSimpleStack <Integer> intStack = new GenSimpleStack <Integer> (nums);
		
		System.out.println("Demonstrating Integer stack.");
		
		try {
			System.out.print("Pushing : ");
			
			for(i=0; !intStack.isFull(); i++) {
				System.out.print(i);
				intStack.push(i);
			}
			
			System.out.println();
			
			System.out.print("Popping : ");
			while(!intStack.isEmpty()) {
				System.out.print(intStack.pop());
			}
			
			System.out.println();
		}
		catch (StackFullException exc) {
			System.out.println(exc);
		}
		catch (StackEmptyException exc) {
			System.out.println(exc);
		}
		
		GenSimpleStack <String> strStack = new GenSimpleStack <String> (strs);
		
		System.out.println("Demonstrating String stack.");
		
		try {
			System.out.println("Pushing : alpha beta gamma");
			
			strStack.push("alpha");
			strStack.push("beta");
			strStack.push("gamma");
			
			System.out.print("Popping : ");
			while(!strStack.isEmpty()) {
				System.out.print(strStack.pop() + " ");
			}
			
			System.out.println();
		}
		catch (StackFullException exc) {
			System.out.println(exc);
		}
		catch (StackEmptyException exc) {
			System.out.println(exc);
		}
	}

}
