// A simple stack class for characters. Updated with access-modifiers. Updated with constructors.
class SimpleStack {
	
	private char[] data;
	private int tos;
	
	SimpleStack(int size) {
		data = new char[size];
		tos=0;
	}
	
	SimpleStack(SimpleStack otherStack) {
		data = new char[otherStack.data.length];
		tos = otherStack.tos;
		for(int i=0;i<tos;i++) {
			data[i] = otherStack.data[i];
		}
	}
	
	SimpleStack(char[] chrs) {
		data = new char[chrs.length];
		tos = 0;
		for(char ch : chrs) {
			push(ch);
		}
	}
	
	void push(char ch) {
		if(isFull()) {
			System.out.println(" -- Stack is full.");
			return;
		}
		data[tos]=ch;
		tos++;
	}
	
	char pop() {
		if(isEmpty()) {
			System.out.println(" -- Stack is empty.");
			return (char)0;
		}
		tos--;
		return data[tos];
	}
	
	boolean isEmpty() {
		return tos==0;
	}
	
	boolean isFull() {
		return tos==data.length;
	}
	
}

class SimpleStackDemo2 {

	public static void main(String[] args) {
		char ch;
		
		char[] chrs = {'A','B','C','D'};
		
		SimpleStack stack1 = new SimpleStack(chrs);
		
		SimpleStack stack2 = new SimpleStack(stack1);
		
		System.out.println("Popping contents of stack1: ");
		while(!stack1.isEmpty()) {
			ch = stack1.pop();
			System.out.print(ch);
		}
		
		System.out.println("\nPopping contents of stack2: ");
		while(!stack2.isEmpty()) {
			ch = stack2.pop();
			System.out.print(ch);
		}

	}

}
