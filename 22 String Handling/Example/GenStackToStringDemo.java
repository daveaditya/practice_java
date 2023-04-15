
class GenStackToStringDemo {

	public static void main(String[] args) throws StackFullException, StackEmptyException {
		// TODO Auto-generated method stub
		Integer iStore[] = new Integer[10];
		GenSimpleStack<Integer> stack = new GenSimpleStack<Integer>(iStore);
		
		System.out.println("Empty Stack: " + stack);
		
		stack.push(1);
		stack.push(2);
		stack.push(3);
		stack.push(4);
		stack.pop();
		
		System.out.println("Non-empty stack: " + stack);
	}

}
