// An interface for a simple stack that stores characters.
interface ISimpleStack {
	void push(char ch) throws StackFullException;
	char pop() throws StackEmptyException;
	boolean isEmpty();
	boolean isFull();
}