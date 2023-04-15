@SuppressWarnings("serial")
// An exception for stack-full errors.
class StackFullException extends Exception {
	int size;
	
	StackFullException (int s) {
		super("stack Full");
		size = s;
	}
	
	public String toString() {
		return("\nStack is full. Maximum size is " + size);
	}
}

@SuppressWarnings("serial")
class StackEmptyException extends Exception {
	
	StackEmptyException() {
		super("Stack Empty");
	}
	
	public String toString() {
		return("\nStack is empty.");
	}
}
