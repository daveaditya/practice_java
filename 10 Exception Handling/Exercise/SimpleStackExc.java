// Add exception handling to the stack classes.
@SuppressWarnings("serial")
class StackFullException extends Exception {
	int size;
	
	StackFullException(int s) {
		super("Stack Full");
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