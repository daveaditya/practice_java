// A generic interface for a simple stack.

public interface IGenSimpleStack <T> {
	
	void push(T item) throws StackFullException;
	
	T pop() throws StackEmptyException ;
	
	boolean isEmpty();
	
	boolean isFull();
	
}
